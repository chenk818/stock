package indi.chenk.stock.module;

import indi.chenk.stock.service.StockService;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;




@At("/")
@IocBean
public class StockModule {

	
	@Inject("stockService")
	StockService service;
	
	
	@At("/line")
	@Ok("raw")
	public Object line(@Param("codes") String codes,@Param("start") String start,@Param("end") String end) {
		return service.getLineChart(codes, start, end);
	}
	
	@At("/query")
	public Object query(@Param("code") String code,@Param("start") String start,@Param("end") String end) {
		try {
			return service.query(code, start, end);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
