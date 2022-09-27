package com.server.main.user.bean;

public class JMultiplyResult {

	private Integer fnum;
	private Integer snum;

	public Integer getFnum() {
		return fnum;
	}

	public void setFnum(Integer fnum) {
		this.fnum = fnum;
	}

	public Integer getSnum() {
		return snum;
	}

	public void setSnum(Integer snum) {
		this.snum = snum;
	}

	public JMultiplyResult(Integer fnum, Integer snum) {
		super();
		this.fnum = fnum;
		this.snum = snum;
	}

	public JMultiplyResult() {

	}

}
