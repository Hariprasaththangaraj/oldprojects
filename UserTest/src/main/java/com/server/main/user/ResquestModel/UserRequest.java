package com.server.main.user.ResquestModel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

	@NotEmpty
	String name;
	@NotNull
	int age;
	@NotEmpty
	String address;
	
}
