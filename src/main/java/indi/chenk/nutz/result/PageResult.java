package indi.chenk.nutz.result;

import java.util.List;

public class PageResult<T> {
	private int total;
	private List<T> rows;

	public PageResult(List<T> rows, int total) {
		this.rows = rows;
		this.total = total;
	}

	public PageResult(List<T> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}
