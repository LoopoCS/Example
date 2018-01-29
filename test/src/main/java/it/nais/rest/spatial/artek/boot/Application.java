package it.nais.rest.spatial.artek.boot;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;




@SpringBootApplication
@EnableJpaRepositories("it.nais.rest.spatial.artek.mobile.*")
@EntityScan("it.nais.rest.spatial.artek.mobile.*")
@EnableSpringDataWebSupport
@ComponentScan("it.nais.rest.spatial.artek.*")
public class Application implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	
	
	
	
	@Override
	public void run(String... arg0) throws Exception {
		//used for fast test

	}
		
	}