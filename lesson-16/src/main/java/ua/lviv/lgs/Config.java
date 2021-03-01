package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	StudentDao studentDao() {
		return new StudentDaoImpl();
	}
}
