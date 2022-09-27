package com.server.main.user.bean;

public class JRequest {

	private Integer addFirstnum;
	private Integer addSecondnum;
	private Integer subFristnum;
	private Integer subSecondnum;
	private Integer multiplyFirstnum;
	private Integer multiplySecondnum;
	private Integer divideFirstnum;
	private Integer divideSecondnum;
	private Integer perForm;

	public Integer getAddFirstnum() {
		return addFirstnum;
	}

	public void setAddFirstnum(Integer addFirstnum) {
		this.addFirstnum = addFirstnum;
	}

	public Integer getAddSecondnum() {
		return addSecondnum;
	}

	public void setAddSecondnum(Integer addSecondnum) {
		this.addSecondnum = addSecondnum;
	}

	public Integer getSubFristnum() {
		return subFristnum;
	}

	public void setSubFristnum(Integer subFristnum) {
		this.subFristnum = subFristnum;
	}

	public Integer getSubSecondnum() {
		return subSecondnum;
	}

	public void setSubSecondnum(Integer subSecondnum) {
		this.subSecondnum = subSecondnum;
	}

	public Integer getMultiplyFirstnum() {
		return multiplyFirstnum;
	}

	public void setMultiplyFirstnum(Integer multiplyFirstnum) {
		this.multiplyFirstnum = multiplyFirstnum;
	}

	public Integer getMultiplySecondnum() {
		return multiplySecondnum;
	}

	public void setMultiplySecondnum(Integer multiplySecondnum) {
		this.multiplySecondnum = multiplySecondnum;
	}

	public Integer getDivideFirstnum() {
		return divideFirstnum;
	}

	public void setDivideFirstnum(Integer divideFirstnum) {
		this.divideFirstnum = divideFirstnum;
	}

	public Integer getDivideSecondnum() {
		return divideSecondnum;
	}

	public void setDivideSecondnum(Integer divideSecondnum) {
		this.divideSecondnum = divideSecondnum;
	}

	public Integer getPerForm() {
		return perForm;
	}

	public void setPerForm(Integer perForm) {
		this.perForm = perForm;
	}

	public JRequest(Integer addFirstnum, Integer addSecondnum, Integer subFristnum, Integer subSecondnum,
			Integer multiplyFirstnum, Integer multiplySecondnum, Integer divideFirstnum, Integer divideSecondnum,
			Integer perForm) {
		super();
		this.addFirstnum = addFirstnum;
		this.addSecondnum = addSecondnum;
		this.subFristnum = subFristnum;
		this.subSecondnum = subSecondnum;
		this.multiplyFirstnum = multiplyFirstnum;
		this.multiplySecondnum = multiplySecondnum;
		this.divideFirstnum = divideFirstnum;
		this.divideSecondnum = divideSecondnum;
		this.perForm = perForm;
	}

	public JRequest() {

	}

}
