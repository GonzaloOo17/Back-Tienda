package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.model.Tienda;
import com.example.demo.model.Usuario;

public interface IUsuarioSERVICE {
	public List<Usuario> list_usuarios();
	public void eliminar(String user);
	public void alta_usuario(Usuario user);
	public Usuario buscar_by_user(int user);
	public int buscar_by_email(String email, String password);

}
