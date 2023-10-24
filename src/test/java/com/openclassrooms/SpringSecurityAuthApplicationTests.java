package com.openclassrooms;

import com.openclassrooms.controllers.LoginController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
class SpringSecurityAuthApplicationTests {

	@Autowired
	private LoginController loginController;

	@Test
	void contextLoads() {
		assertThat(loginController).isNotNull();
	}

}
