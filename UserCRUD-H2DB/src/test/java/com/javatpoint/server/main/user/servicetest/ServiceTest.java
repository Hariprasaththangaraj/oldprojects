package com.javatpoint.server.main.user.servicetest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.javatpoint.server.main.user.controllermessages.DeleteMessage;
import com.javatpoint.server.main.user.dao.UserRepository;
import com.javatpoint.server.main.user.modelresponse.UserModel;
import com.javatpoint.server.main.user.service.EmptyResponse;
import com.javatpoint.server.main.user.service.UserService;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
class ServiceTest {

	@InjectMocks
	private UserService userService;
	
	@Autowired
	private MockMvc mockMvc;

	@Mock
	private UserRepository userRepository;

	@Test
	void throwExcpetionforget() throws EmptyResponse {

		when(userRepository.findById(Mockito.anyInt()))
				.thenReturn(Optional.of(new UserModel(1, "Hari", 960, "Veetu address", null)));
		UserModel userModel = userService.get(1);
		assertEquals("Hari", userModel.getName());
	}

	@Test
	void testCaseforsave() throws Exception {

		when(userRepository.save(Mockito.any())).thenReturn(new UserModel(1, "Hari", 960, "Veetu address", null));
		UserModel userModel = userService.add(new UserModel(1, "Hari", 960, "Veetu address", null));
		assertEquals("Veetu address", userModel.getAddress());
	}

	@Test
	void testCaseforput() {

		when(userRepository.save(Mockito.any())).thenReturn(new UserModel(1, "Hari", 960, "Veetu address", null));
		UserModel userModel = userService.put(new UserModel(1, "Hari", 960, "Veetu address", null));
		assertEquals(960, userModel.getPhonenumber());

	}

	@Test
	void testCasefordelete() {

		doNothing().when(userRepository).deleteById(Mockito.anyInt());
		 userService.delete(1);
	    Mockito.verify(userRepository,times(1)).deleteById(Mockito.anyInt());

	}

	@Test
	void testCaseforEmptyresponse() throws EmptyResponse {
		when(userRepository.findById(Mockito.anyInt())).thenReturn(Optional.ofNullable(null));
	 assertThrows(EmptyResponse.class, () -> userService.get(0));

	}

}
