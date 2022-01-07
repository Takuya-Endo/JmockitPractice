
//JUnit4の為コメントアウト

//package jp.co.sample.controller;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class SampleControllerTest {
//	
//	private MockMvc mockMvc;
//
//	@Before
//	public void before() {
//		MockitoAnnotations.initMocks(this);
//		this.mockMvc = MockMvcBuilders.standaloneSetup(new SampleController()).build();
//	}
//	
//	@Test
//	public void testInputMethod() throws Exception {
//		this.mockMvc.perform(post("/sample")).andDo(print())
//												.andExpect(status().isOk())
//												.andExpect(view().name("sample/input"));
//	}
//	
//	@Test
//	public void testResultMethod() throws Exception {
//		this.mockMvc.perform(post("/sample/result").param("name", "RJC　太郎")).andDo(print())
//																				.andExpect(status().isOk())
//																				.andExpect(view().name("sample/result"));
//	}
//	
//}
