package com.example.demo.web;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.DevopsApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DevopsApplication.class)
@WebAppConfiguration
public class WelcomeControllerTest {

	@Autowired
	private WebApplicationContext context;

	MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testWelcome() throws Exception {
		// mockmvc.perform(get("/")).andExpect(model().attribute("course",
		// containsString("DevOps")));
	}

}
