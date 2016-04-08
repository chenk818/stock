package indi.chenk.stock.service;

import indi.chenk.nutz.service.BaseService;
import indi.chenk.stock.pojo.Deal;
import indi.chenk.tool.util.StringTool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.nutz.dao.Cnd;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.nutz.dao.util.cri.Static;
import org.nutz.ioc.loader.annotation.IocBean;


@IocBean
public class StockService  extends BaseService {

	
	public List<Deal> query(String code,String start,String end) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		if(StringTool.isNull(start)) {
			Calendar calendar = Calendar.getInstance();  
			calendar.add(Calendar.MONTH, -3);
			Date d = calendar.getTime();
			start = sdf.format(d);
			end = sdf.format(new Date());
		}else if(StringTool.isNull(end)) {
			end = sdf.format(new Date());
		}
		start = sdf2.format(sdf.parse(start));
		end = sdf2.format(sdf.parse(end));
		SimpleCriteria cri = Cnd.cri();
		cri.where().and(new Static("dealtime>='"+start+"'"));
		cri.where().and(new Static("dealtime<='"+end+"'"));
		cri.where().andEquals("code", code);
		cri.getOrderBy().asc("dealtime");
		
		return super.query(Deal.class, cri);
		
	}
	
	public File getLineChart(String codes,String start,String end) {
		try {
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			if(StringTool.isNull(start)) {
				Calendar calendar = Calendar.getInstance();  
				calendar.add(calendar.MONTH, -3);
				Date d = calendar.getTime();
				start = sdf.format(d);
				end = sdf.format(new Date());
			}else if(StringTool.isNull(end)) {
				end = sdf.format(new Date());
			}
			start = sdf2.format(sdf.parse(start));
			end = sdf2.format(sdf.parse(end));
			String[] codeKeys = codes.split(",");
			SimpleCriteria cri = Cnd.cri();
			cri.where().and(new Static("dealtime>='"+start+"'"));
			cri.where().and(new Static("dealtime<='"+end+"'"));
			cri.where().andIn("code", codeKeys);
			cri.getOrderBy().asc("code").asc("dealtime");
			
			List<Deal> dealList = super.query(Deal.class, cri);
			Map<String,List<Deal>> codeDetail = new HashMap<String,List<Deal>>();
			String[] rowKeys = new String[codeKeys.length];
			for(Deal d:dealList) {
				if(codeDetail.containsKey(d.getCode())) {
					codeDetail.get(d.getCode()).add(d);
				}else {
					List<Deal> list = new ArrayList<Deal>();
					list.add(d);
					codeDetail.put(d.getCode(),list);
				}
			}
			String[] columnKeys = null;
			boolean init = false;
			double[][] data = new double[rowKeys.length][]; 
			int pos = 0;
			for(String code:codeKeys) {
				List<Deal> list = codeDetail.get(code);
				if(null == columnKeys) {
					columnKeys = new String[list.size()];
				}
				double[] row = new double[list.size()];
				for(int i=0;i<list.size();i++) {
					if(!init) {
						columnKeys[i] = list.get(i).getDealtime();
					}
					row[i] = list.get(i).getTclose();
				}
				init = true;
				data[pos] = row;
				rowKeys[pos] = list.get(0).getName();
				pos += 1;
			}
			return getLine(codes,data,columnKeys,rowKeys);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private File getLine(String codes,double[][] data,String[] columnKeys,String[] rowKeys) throws Exception {
		File file = File.createTempFile(codes, ".jpg");
		OutputStream out = null;
		out = new FileOutputStream(file, true);
		
		
		
		return file;
	}
	
	
	
}
