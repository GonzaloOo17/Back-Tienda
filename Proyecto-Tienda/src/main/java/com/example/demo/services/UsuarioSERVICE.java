package com.example.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsuarioRepository;
import com.example.demo.interfaces.IUsuarioSERVICE;
import com.example.demo.model.Tienda;
import com.example.demo.model.Usuario;

@Service
public class UsuarioSERVICE implements IUsuarioSERVICE {

	@Autowired
	IUsuarioRepository usuariorepository;
	
	
	@Override
	public List<Usuario> list_usuarios() {
		System.out.println("list_usuarios");
		List<Usuario> list =(List<Usuario>) usuariorepository.findAll(); 
		  
        // Add each element of iterator to the List 
        System.out.println("usuarios"+usuariorepository.count());;
       
		
		return list;
	}


	@Override
	public void eliminar(String user) {
		usuariorepository.deleteById(user);
		
	}


	@Override
	public void alta_usuario(Usuario user) {
		try {
			usuariorepository.save(user);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}


	@Override
	public Usuario buscar_by_user(int user) {
		Usuario usuario=null;
		try {
			List<Usuario> aux =usuariorepository.findByUser(user);
			usuario = aux.get(0);
			//usuario=usuariorepository.findById(user).get();
		}catch(Exception e) {
			System.out.println(e);
		}
		return usuario;
	}
	
	


	@Override
	public int buscar_by_email(String email, String password) {
		// TODO Auto-generated method stub
		
		List<Usuario> usuario = usuariorepository.findByEmail(email);
		System.out.println(usuario.get(0).getPassword());
		if((usuario.size()==1) && (usuario.get(0).getPassword().equals(password) )) return usuario.get(0).getUser(); 
		else return 0;
		
	}

}
