package com.javatpoint.server.main.user.controller;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatpoint.server.main.user.modelresponse.Gender;
import com.javatpoint.server.main.user.modelresponse.UserModel;
import com.javatpoint.server.main.user.service.UserService;

@WebMvcTest(UserController.class)
class ControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	@Autowired
	private UserController userController;

	private static final ObjectMapper mapper = new ObjectMapper();

	@Test
	void controllerPosttest() throws JsonProcessingException, Exception {
		when(userService.add(Mockito.any(UserModel.class))).thenReturn(new UserModel(1, "Hari", 960, "Add", Gender.MALE));
		this.mockMvc
				.perform(post("/Api/v1/user").contentType(MediaType.APPLICATION_JSON)
						.content(mapper.writeValueAsBytes(new UserModel(1, "Hari", 960, "Add", null))))
				.andExpect(status().isCreated());
	}

	@Test
	void controllerGettest() throws JsonProcessingException, Exception {

		// parameter passing doubt
		when(userService.get(Mockito.anyInt())).thenReturn(new UserModel(1, null, 0, null, null));
		this.mockMvc.perform(get("/api/v1/user/" + "" + "1")).andExpect(status().isOk());
	}

	@Test
	void controllerDeletetest() throws Exception {

		doNothing().when(userService).delete(0);

		// Accepted vs not acceptable doubt
		this.mockMvc.perform(delete("/api/v1/user/1")).andExpect(status().isAccepted());
	}

	@Test
	void controllerPuttest() throws Exception {

		when(userService.put(Mockito.any(UserModel.class))).thenReturn(new UserModel(1, "Hari", 960, "Add", null));

		this.mockMvc
				.perform(put("/api/v1/user").contentType(MediaType.APPLICATION_JSON)
						.content(mapper.writeValueAsBytes(new UserModel(1, "Hari", 960, "Add", null))))
				.andExpect(status().isCreated());

	}

}
