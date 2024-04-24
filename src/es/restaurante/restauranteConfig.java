package es.restaurante;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("es.restaurante")
@PropertySource("classpath:datosRestaurante.propiedades")
public class restauranteConfig {
	
	
	
	//Definimos los bean que hagan falta
	
		
	//Importante, el scope se pone aqui en el beans
	@Bean
	@Scope("prototype")
	public Plato PrimerPlato() {
		return new Principal();
	}
	
	@Bean
	public Plato Postre() {
		return new Postre();
		
	}
	
	

}
