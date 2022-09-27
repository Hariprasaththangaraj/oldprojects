package com.server.main.user.StudentResponseModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Builder
public class SubjectId {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer SubjectId;
	private Integer tamil;
	private Integer english;
	private Integer total;

	public Integer getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(Integer subjectId) {
		SubjectId = subjectId;
	}

	public Integer getTamil() {
		return tamil;
	}

	public void setTamil(Integer tamil) {
		this.tamil = tamil;
	}

	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Integer getTotal() {
		return this.getEnglish() + this.getTamil();
	}

	public void setTotal(Integer total) {
		this.total = this.getTotal();
	}

	public SubjectId() {

	}

	public SubjectId(Integer subjectId, Integer tamil, Integer english, Integer total) {
		super();
		SubjectId = subjectId;
		this.tamil = tamil;
		this.english = english;
		this.total = total;
	}

}
