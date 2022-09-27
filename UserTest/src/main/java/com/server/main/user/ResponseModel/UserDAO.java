

package com.server.main.user.ResponseModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class UserDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	int sno;
	String name;
	int age;
	String address;

}
