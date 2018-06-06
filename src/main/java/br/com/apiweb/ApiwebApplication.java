package br.com.apiweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import br.com.apiweb.ws.controller.TokenFilter;


@SpringBootApplication
//@ComponentScan(basePackageClasses=ApiwebApplication.class)
public class ApiwebApplication {
	
	@Bean
	public FilterRegistrationBean getFiltroJwt(){
		FilterRegistrationBean  frb = new FilterRegistrationBean();
		frb.setFilter(new TokenFilter() );
		frb.addUrlPatterns("/admin/*");
		
		return frb;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(ApiwebApplication.class, args);
	}
}
