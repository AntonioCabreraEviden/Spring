package com.tareaIoC;

public class UsuarioMongo implements IUsuarios {
	
	private String nombre;
	private int id;
	
	public UsuarioMongo(String nombre,int id) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario con mongo "+nombre);

	}

	@Override
	public void eliminaUsuarioById(int id) {
		System.out.println("Eliminando usuario "+id);

	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Usuario-Mongo [nombre=" + nombre + ", id=" + id + "]";
	}
	
	

}
