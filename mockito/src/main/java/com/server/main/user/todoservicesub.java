package com.server.main.user;

import java.util.Arrays;
import java.util.List;

public class todoservicesub implements todoservice{

	@Override
	public List<String> getTodos(String user) {
		
		return Arrays.asList(" Use Core Java ", " Use spring Core ", " Use Hibernate ", " Use spring MVC ");
	}

}
