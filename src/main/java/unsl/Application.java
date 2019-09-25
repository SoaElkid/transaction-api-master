package unsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	/* crear una sola instancia del restTemplate, 
	@Bean  
	public RestTemplate getRestTemplate(){
		   return new RestTemplate();
	}
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
   
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
