package indi.chenk.stock.pojo;

import lombok.Data;
import indi.chenk.nutz.pojo.BaseEntity;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("stock")
@Data
public class Stock extends BaseEntity {

	@Column("code")
	private String code;
	
	
	@Column("name")
	private String name;
}
