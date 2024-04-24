package es.restaurante;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Postre implements Plato,InitializingBean,DisposableBean {
	
	@Value("${IVA}")
	private double IVA;
	@Value("${precioPostre}")
	private double precio;
	
	@Autowired
	@Qualifier("descripcionPostre")
	private Descripciones descripcion;

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Postre";
	}

	@Override
	public Double getPrecioReal() {
		// TODO Auto-generated method stub
		return precio *(1+IVA);
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return descripcion.getDescripcion();
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-genera2ted method stub
		System.out.println("Se acabo el postre");
		
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("El postre esta servido!");
	}

}
