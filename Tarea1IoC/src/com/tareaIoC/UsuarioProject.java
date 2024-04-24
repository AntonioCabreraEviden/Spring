package com.tareaIoC;

import java.util.ArrayList;
import java.util.List;

public class UsuarioProject {

	private List<IUsuarios> lista;

	public UsuarioProject() {
		lista = new ArrayList<IUsuarios>();
	}

	public void getInsertarUsuario(IUsuarios user) {

		if (!lista.contains(user)) {
			lista.add(user);
			user.insertaUsuario();
		} else {
			System.out.println("Ese usuario ya existe");
		}

	}

	public void getEliminarUsuarioById(int id) {

		for (IUsuarios u : lista) {
			if (u.getId() == id) {
				lista.remove(u);
				u.eliminaUsuarioById(id);
				break;
			}
		}
		

	}

	public List<IUsuarios> getLista() {

		return lista;
	}

}
