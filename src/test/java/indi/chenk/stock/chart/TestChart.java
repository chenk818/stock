package indi.chenk.stock.chart;

import indi.chenk.tool.chart.CharParam;
import indi.chenk.tool.chart.impl.BarChart;
import indi.chenk.tool.chart.impl.BarTheme;
import indi.chenk.tool.chart.impl.LineChart;
import indi.chenk.tool.chart.impl.LineTheme;
import indi.chenk.tool.chart.impl.PieChart;
import indi.chenk.tool.chart.impl.PieTheme;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.junit.Test;


/**
 * @Description:图表生成单测
 * @author zbl
 *
 * @date 2015.04.03
 */
public class TestChart {

	/**
	 * 生成柱状图表
	 * 
	 * @param xTitle
	 *            x轴名称
	 * @param yTitle
	 *            y轴名称
	 * @param width
	 *            宽度
	 * @param height
	 *            高度
	 * @param data
	 *            图表数据
	 * @param out
	 *            图表输出流
	 * @throws Exception
	 */
	@Test
	public void testBarChart() throws Exception {
		BarChart chart = new BarChart();
		chart.setTheme(new BarTheme());
		File file = new File("D:" + File.separator + "temp" + File.separator
				+ "docs" + File.separator + "2.jpeg");
		OutputStream out = null;
		out = new FileOutputStream(file, true);
		String str = "";
		for (byte temp : str.getBytes()) {
			out.write(temp);
		}
		CharParam param = new CharParam();
		double[][] data = new double[][] { { 672, 766, 223, 540, 126 },
				{ 325, 521, 210, 340, 106 }, { 332, 256, 523, 240, 526 } };
		String[] rowKeys = { "苹果", "梨子", "葡萄" };
		String[] columnKeys = { "北京", "上海", "广州", "成都", "深圳" };
		param.setData(data);
		param.setColumnKeys(columnKeys);
		param.setRowKeys(rowKeys);
		chart.create("姓名", "产量", 500, 300,
				chart.putDefaultCategoryDataset(param), out);
	}

	/**
	 * 生成折线图表
	 * 
	 * @param xTitle
	 *            x轴名称
	 * @param yTitle
	 *            y轴名称
	 * @param width
	 *            宽度
	 * @param height
	 *            高度
	 * @param data
	 *            图表数据
	 * @param out
	 *            图表输出流
	 * @throws Exception
	 */
	@Test
	public void testLineChart() throws Exception {
		LineChart chart = new LineChart();
		chart.setTheme(new LineTheme());
		File file = new File("D:" + File.separator + "temp" + File.separator
				+ "2.jpeg");
		OutputStream out = null;
		out = new FileOutputStream(file, true);
		String str = "";
		for (byte temp : str.getBytes()) {
			out.write(temp);
		}
		CharParam param = new CharParam();
		double[][] data = new double[][] { { 672, 766, 223, 540, 126 },
				{ 325, 521, 210, 340, 106 }, { 332, 256, 523, 240, 526 } };
		String[] rowKeys = { "苹果", "梨子", "葡萄" };
		String[] columnKeys = { "北京", "上海", "广州", "成都", "深圳" };
		param.setData(data);
		param.setColumnKeys(columnKeys);
		param.setRowKeys(rowKeys);
		chart.create("时间", "产量", 800, 400,
				chart.putDefaultCategoryDataset(param), out);
	}

	/**
	 * 生成饼状图表
	 * 
	 * @param title
	 *            饼图名称
	 * @param width
	 *            宽度
	 * @param height
	 *            高度
	 * @param data
	 *            图表数据
	 * @param out
	 *            图表输出流
	 * @throws Exception
	 */
	@Test
	public void testPieChart() throws Exception {
		PieChart chart = new PieChart();
		chart.setTheme(new PieTheme());
		File file = new File("D:" + File.separator + "temp" + File.separator
				+ "docs" + File.separator + "2.jpeg");
		OutputStream out = null;
		out = new FileOutputStream(file, true);
		String str = "";
		for (byte temp : str.getBytes()) {
			out.write(temp);
		}
		CharParam param = new CharParam();
		double[] data = new double[] { 10, 90 };
		String[] rowKeys = { "success rate", "fail rate" };
		param.setPieData(data);
		param.setRowKeys(rowKeys);
		chart.create("成功率图饼", 800, 400, chart.putPieCategoryDataset(param), out);
	}
}
