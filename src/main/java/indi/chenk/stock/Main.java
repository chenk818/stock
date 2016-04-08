package indi.chenk.stock;

import indi.chenk.nutz.dao.DaoUtil;
import indi.chenk.stock.pojo.Deal;
import indi.chenk.stock.pojo.Stock;
import indi.chenk.stock.util.ExcelUtil;
import indi.chenk.tool.util.StringTool;
import indi.chenk.tool.util.UUIDUtil;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.nutz.http.Http;
import org.nutz.http.Request;
import org.nutz.mvc.Mvcs;
import org.nutz.trans.Atom;
import org.nutz.trans.Trans;

public class Main {

	// http://quotes.money.163.com/service/chddata.html?code=0600000&start=20100101&end=20160406&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP
	// http://quotes.money.163.com/service/chddata.html?code=1000523&start=19931108&end=20160407&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP
	public static String URL = "http://quotes.money.163.com/service/chddata.html?fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP&code=";

	private static Dao dao = DaoUtil.getInst().getDao();

	public static void main(String[] args) throws Exception {
		// initStockcode();
		initHistory();
	}

	private static void initHistory() throws Exception {
		SimpleCriteria cri = Cnd.cri();
		cri.where().andEquals("state", 1);
		List<Stock> list = dao.query(Stock.class,cri);
		int total = list.size();
		int pos = 1;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		for (final Stock s : list) {
			String start = s.getLastTime();
			if(StringTool.isNull(start)) {
				start = "20130101";
			}
			final String end = sdf.format(new Date());
			if(!start.equals(end)) {
				final List<Deal> dealList = getStockDeal(s.getCode(),start,end);
				System.out.println("start to get " + s.getCode() + " data,"
						+ "it has " + dealList.size());
				
				Trans.exec(new Atom() {

					@Override
					public void run() {
						dao.insert(dealList);
						s.setLastTime(end);
						dao.update(s);
					}
					
				});
				
			}
			

		}
	}

	private static List<Deal> getStockDeal(String code,String start,String end) throws Exception {
		String oldcode = code;
		if(code.length() == 7) {
			//上证代码，什么也不干；
		}else if (code.startsWith("6")) {
			code = "0" + code;
		} else if (code.startsWith("0")) {
			code = "1" + code;
		}
		String url = URL + code + "&start="+start + "&end="+end;
		InputStream is = Http.get(url).getStream();
		File f = File.createTempFile(code, ".csv");

//		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
//				new FileOutputStream(f)));
//
//		byte[] bs = new byte[1024];
//		int len = is.read(bs);
//		while (len != -1) {
//			out.write(bs, 0, len);
//			len = is.read(bs);
//		}
//		out.close();

		DataInputStream in = new DataInputStream(is);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in,
				"GBK"));
		reader.readLine();// 第一行信息，为标题信息，不用，如果需要，注释掉
		String line = null;
		List<Deal> list = new ArrayList<Deal>();

		while ((line = reader.readLine()) != null) {
			String arr[] = line.split(",");// CSV格式文件为逗号分隔符文件，这里根据逗号切分

			Deal d = new Deal();
			d.setDealtime(arr[0]);
			d.setCode(oldcode);
			d.setName(arr[2]);
			d.setTclose(getDouble(arr[3]));
			d.setHigh(getDouble(arr[4]));
			d.setLow(getDouble(arr[5]));
			d.setTopen(getDouble(arr[6]));
			d.setLclose(getDouble(arr[7]));
			d.setChg(getDouble(arr[8]));
			d.setPchg(getDouble(arr[9]));
			d.setTurnover(getDouble(arr[10]));
			d.setVoturnover(getDouble(arr[11]));
			d.setVaturnover(getDouble(arr[12]));
			if(arr.length == 15) {
				d.setTcap(getDouble(arr[13]));
				d.setMcap(getDouble(arr[14]));
			}
			d.setId(UUIDUtil.getShortUUID());
			list.add(d);

		}
		return list;
	}

	private static double getDouble(String s) {
		try {
			return Double.valueOf(s);
		} catch (Exception e) {

		}
		return 0;
	}

	private static void initStockcode() throws Exception {

		String path = "F:\\git_repo\\stock\\src\\main\\resources\\code.txt";

		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				new File(path)));
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();
		List<Stock> list = new ArrayList<Stock>();
		while (line != null) {
			String[] arr = line.split(" ");

			Stock s = new Stock();
			s.setCode(arr[arr.length - 1]);
			String name = "";
			for (int i = 0; i < arr.length - 1; i++) {
				name += arr[i];
			}
			s.setName(name);
			list.add(s);
			line = br.readLine(); // 一次读入一行数据
		}

		for (int i = 0; i < list.size(); i++) {
			Stock s = list.get(i);
			s.setId((i + 1) + "");
			dao.insert(s);
		}
	}

}
