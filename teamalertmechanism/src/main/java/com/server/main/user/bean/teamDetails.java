package com.server.main.user.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@Data
@ToString
@NoArgsConstructor
public class teamDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer teamId;
	
	@Column(name="team_name")
	private String teamName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="dev_id")
	private List<developerdetails> developers;
	
}
