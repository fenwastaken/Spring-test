package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloM2iConfig {

	@Bean
	public HelloM2i HelloM2i(){
		return new HelloM2i();
	}

}
