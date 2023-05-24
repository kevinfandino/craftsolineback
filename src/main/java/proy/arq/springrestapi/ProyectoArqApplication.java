package proy.arq.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import proy.arq.springrestapi.config.WebConfig;



@SpringBootApplication
@Import(WebConfig.class)
public class ProyectoArqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoArqApplication.class, args);
	}

}
