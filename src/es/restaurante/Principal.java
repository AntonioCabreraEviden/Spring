package es.restaurante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") esto se pone en el bean no aqui
public class Principal implements Plato {
	
	@Value("${IVA}")
	private double IVA;
	@Value("${precioPrincipal}")
	private double precio;
	
	@Autowired
	@Qualifier("descripcionPrincipal")
	private Descripciones descripcion;	
	

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Plato principal";
	}

	@Override
	public Double getPrecioReal() {
		return precio *(IVA+1);
	}
	@Override
	public String getDescripcion() {
		return descripcion.getDescripcion();		
	}

}
