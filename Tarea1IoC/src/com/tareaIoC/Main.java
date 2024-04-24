package com.tareaIoC;

public class Main {

	public static void main(String[] args) {
		
		UsuarioProject listaUsuarios = new UsuarioProject();
		
		insertarValores(listaUsuarios);
		
		for (IUsuarios s : listaUsuarios.getLista()) {
			System.out.println(s);
		}
		
		listaUsuarios.getEliminarUsuarioById(1);
		listaUsuarios.getEliminarUsuarioById(2);
		listaUsuarios.getEliminarUsuarioById(5);
		listaUsuarios.getEliminarUsuarioById(6);
		
		for (IUsuarios s : listaUsuarios.getLista()) {
			System.out.println(s);
		}
		

	}

	private static void insertarValores(UsuarioProject listaUsuarios) {
		listaUsuarios.getInsertarUsuario(new UsuarioMongo("Antonio", 1));
		listaUsuarios.getInsertarUsuario(new UsuarioMongo("Paco", 2));
		listaUsuarios.getInsertarUsuario(new UsuarioMongo("Pepe", 3));
		listaUsuarios.getInsertarUsuario(new UsuarioMongo("Maria", 4));
		listaUsuarios.getInsertarUsuario(new UsuarioOracle("Marta", 5));
		listaUsuarios.getInsertarUsuario(new UsuarioOracle("Adriana", 6));
		listaUsuarios.getInsertarUsuario(new UsuarioOracle("Jesus", 7));
		listaUsuarios.getInsertarUsuario(new UsuarioOracle("Pablo", 8));
		listaUsuarios.getInsertarUsuario(new UsuarioOracle("Alejandro", 9));
	}

}
