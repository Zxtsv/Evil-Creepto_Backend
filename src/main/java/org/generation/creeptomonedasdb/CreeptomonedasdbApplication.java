package org.generation.creeptomonedasdb;
import org.generation.creeptomonedasdb.jwt.config.JwtFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreeptomonedasdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreeptomonedasdbApplication.class, args);
	}//main

	
//	@Bean
//	public FilterRegistrationBean<JwtFilter> jwtFilter() {
//		FilterRegistrationBean<JwtFilter> registrationBean =
//				new FilterRegistrationBean<>();
//		registrationBean.setFilter( new JwtFilter());
//		//registrationBean.addUrlPatterns("/api/usuarios/*");
//		//registrationBean.addUrlPatterns("/api/productos/");
//		return registrationBean;
//	} // jwtFilter
}//class
