package es.restaurante;

import org.springframework.stereotype.Component;

@Component
public class DescripcionPostre implements Descripciones {

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Descripcion del postre";
	}

}
