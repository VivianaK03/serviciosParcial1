package co.com.posso.microservice.resolveEnigmaApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configurationes {

	
	    @Bean
	    public RestTemplate restTesmplate() {
	        return new RestTemplate();
	    }

	}

