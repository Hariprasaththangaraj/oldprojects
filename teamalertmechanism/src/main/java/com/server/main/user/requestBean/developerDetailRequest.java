package com.server.main.user.requestBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class developerDetailRequest {

	private Integer developerId;
	private String name;
	private Long phoneNumber;
}
