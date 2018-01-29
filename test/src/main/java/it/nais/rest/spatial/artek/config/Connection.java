package it.nais.rest.spatial.artek.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;



@Configuration
public class Connection {



	@Bean
	public ObjectMapper objectmapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JtsModule());
	return mapper;	
	}

}
