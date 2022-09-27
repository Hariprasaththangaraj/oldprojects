package com.javatpoint.server.main.user.jmodelrequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelRequest {

	String name;
	Long phonenumber;
	String gender;
	String address;
}
