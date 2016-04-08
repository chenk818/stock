package indi.chenk.stock.pojo;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;
import indi.chenk.nutz.pojo.BaseEntity;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("deal")
@Data
public class Deal extends BaseEntity {

	@Column("code")
	private String code;
	
	
	@Column("name")
	private String name;
	
	@Column("dealtime")
	private Date dealtime;
	
	@Column("topen")
	private double topen;
	
	@Column("tclose")
	private double tclose;
	
	@Column("high")
	private double high;
	
	@Column("low")
	private double low;
	
	@Column("lclose")
	private double lclose;
	
	
	@Column("chg")
	private double chg;
	
	@Column("pchg")
	private double pchg;
	
	@Column("turnover")
	private double turnover;
	
	
	//成交量
	@Column("voturnover")
	private double voturnover;
	
	//成交金额
	@Column("vaturnover")
	private double vaturnover;
	
	//总市值
	@Column("tcap")
	private double tcap;
	//流通市值
	@Column("mcap")
	private double mcap;
}
