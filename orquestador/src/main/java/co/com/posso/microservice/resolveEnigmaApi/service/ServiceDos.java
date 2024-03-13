package co.com.posso.microservice.resolveEnigmaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.com.posso.microservice.resolveEnigmaApi.config.Configurationes;

@Service
public class ServiceDos {

	@Autowired
	private Configurationes restTemplate;


	    public String orquestador() {
	        String mensaje1 = llamarServicio1();
	        String mensaje2 = llamarServicio2();
	        String mensaje3 = llamarServicio3();
	        
	        String resultado = mensaje1 + ", " + mensaje2 + ", " + mensaje3;
	        
	        return resultado;
	    }
	    
	    private String llamarServicio1() {
	        ResponseEntity<String> response = restTemplate.restTesmplate().getForEntity("http://localhost:8080/v1/getOneEnigma/mensaje", String.class);
	        return response.getBody();
	    }
	    
	    private String llamarServicio2() {
	        ResponseEntity<String> response = restTemplate.restTesmplate().getForEntity("http://localhost:8082/v1/getOneEnigma/mensaje", String.class);
	        return response.getBody();
	    }
	    
	    private String llamarServicio3() {
	        ResponseEntity<String> response = restTemplate.restTesmplate().getForEntity("http://localhost:8084/v1/getOneEnigma/mensaje", String.class);
	        return response.getBody();
	    }
}
