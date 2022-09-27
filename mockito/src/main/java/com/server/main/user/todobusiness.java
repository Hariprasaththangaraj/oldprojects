package com.server.main.user;

import java.util.ArrayList;
import java.util.List;

public class todobusiness {

	public todoservice Todoservice;

	public todobusiness(todoservice todoservice) {
		this.Todoservice = todoservice;
	}

	public List<String> getToDosforSpring(String user) {

		List<String> retrived = new ArrayList<>();

		List<String> todos = Todoservice.getTodos(user);

		for (String todo : todos)
			if (todo.contains("spring"))
				todos.add(todo);

		return retrived;
	}

}