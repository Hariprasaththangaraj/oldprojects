package com.server.main.user.requestBean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JsonTeamRequest {

	private String teamName;
	private List<developerDetailRequest> developerDetailRequest;
}
