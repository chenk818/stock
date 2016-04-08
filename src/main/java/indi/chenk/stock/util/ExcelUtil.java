package indi.chenk.stock.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


public class ExcelUtil {

	public static List<String[]> fromTemplate(InputStream is,int cols) {
		HSSFWorkbook workbook = null;
		try {
			workbook = new HSSFWorkbook(is);
			HSSFSheet sheet = workbook.getSheetAt(0);
			return getRows(sheet,cols);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(null != workbook) {
				try {
					workbook.close();
				} catch (IOException e) {
				}
			}
		}
		return null;
	}
	
	public static List<String[]> fromTemplate(File f,int cols) {
		try {
			return fromTemplate( new FileInputStream(f),cols);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static List<String[]> getRows(HSSFSheet sheet,int cols) {
		List<String[]> list = new ArrayList<String[]>();
		int idx = 1;
		while(true) {
			HSSFRow row = sheet.getRow(idx++);
			if(null == row || null == row.getCell(0)) {
				break;
			}
			if(null == row.getCell(0) || null == row.getCell(1)) {
				break;
			}
			String[] data = new String[cols];
			for(int i=0;i<cols;i++) {
				HSSFCell cell = row.getCell(i);
				if(null == cell) {
					data[i] = "";
				}else {
					cell.setCellType(Cell.CELL_TYPE_STRING);
					data[i] = cell.getStringCellValue();
				}
				
			}
			list.add(data);
		}
		return list;
	}
	
	
	
}
