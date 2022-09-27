package com.category.model;

import java.util.List;

public class CategoryRequest {

	private Long id;
	private List<PersonalDetail> personalDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<PersonalDetail> getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(List<PersonalDetail> personalDetails) {
		this.personalDetails = personalDetails;
	}

}
