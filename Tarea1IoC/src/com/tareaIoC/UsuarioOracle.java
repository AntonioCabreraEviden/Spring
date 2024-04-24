package com.tareaIoC;

public class UsuarioOracle implements IUsuarios {
	
	private String nombre;
	private int id;
	
	public UsuarioOracle(String nombre,int id) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario con oracle " +nombre);
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
		return "Usuario-Oracle [nombre=" + nombre + ", id=" + id + "]";
	}

}
