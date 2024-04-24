package es.restaurante;

import org.springframework.stereotype.Component;

@Component
public class DescripcionPrincipal implements Descripciones {

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Esta es la descripcion del plato principal";
	}

}
