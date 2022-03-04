package org.generation.creeptomonedasdb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.generation.creeptomonedasdb.models.Usuarios;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@AutoConfigureMockMvc
@SpringBootTest
class CreeptomonedasdbApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void testGet() throws Exception {
		this.mockMvc.perform(get("/api/usuarios/2")	)
		.andDo(print())
		.andExpect(status().isOk()).andExpect(content().string(containsString("Doggy") ));

	} // testGet
	
	@Test
	public void testPost() throws Exception {
		Usuarios u = new Usuarios();
		u.setNombre_usuario("April");
		u.setEmail("abril@gmail.com");
		
		
		this.mockMvc.perform(post("/api/usuarios/").header("Authorization", "Bearer ")
				.contentType(MediaType.APPLICATION_JSON).content(asJsonString(u))).andExpect(status().isOk());
	}//testPost

	//Serializar
		public static String asJsonString(final Object obj) {
		    try {
		      return new ObjectMapper().writeValueAsString(obj);
		    } catch (Exception e) {
		      throw new RuntimeException(e);
		    }//catch
	 } // asJsonString
}
