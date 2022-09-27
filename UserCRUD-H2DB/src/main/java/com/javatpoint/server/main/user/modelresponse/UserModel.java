package com.javatpoint.server.main.user.modelresponse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sno;

	String name;

	long phonenumber;

	String address;

	@Column(columnDefinition = "ENUM('Male','Female','Notspecified')")
	@Enumerated(EnumType.STRING)
	Gender gender;

}
