package es.restaurante;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMenu {

	public static void main(String[] args) {
		//Leo el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(restauranteConfig.class);
		
		//Cargo los bean
		Plato plato1 = contexto.getBean("PrimerPlato",Plato.class);		
		Plato plato2 = contexto.getBean("PrimerPlato",Plato.class);	
		
		Plato postre1 = contexto.getBean("Postre",Plato.class);
		Plato postre2 = contexto.getBean("Postre",Plato.class);
		
		//Uso los bean
		if(plato1 != plato2) {
			System.out.println("No tiene la misma referencia");
			System.out.println(plato1);
			System.out.println(plato2);
		}
		
		System.out.println(plato1.getPrecioReal());
		System.out.println(plato1.getNombre());
		System.out.println(plato1.getDescripcion());
		
		if(postre1 == postre2) {
			System.out.println("Tiene la misma referencia");
			System.out.println(postre1);
			System.out.println(postre2);
		}
		System.out.println(postre1.getPrecioReal());
		System.out.println(postre1.getNombre());
		System.out.println(postre1.getDescripcion());
	
		
		//Cierro el contexto
		contexto.close();

	}

}
