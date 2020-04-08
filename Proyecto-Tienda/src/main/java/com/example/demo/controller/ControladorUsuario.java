package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.ICategoriaSERVICE;
import com.example.demo.interfaces.IProfileSERVICE;
import com.example.demo.interfaces.ITiendaSERVICE;
import com.example.demo.interfaces.IUsuarioSERVICE;
import com.example.demo.model.Profile;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/rest", produces="application/json")
public class ControladorUsuario {
	
	@Autowired(required=true)
	ICategoriaSERVICE categoriaSERVICE;
	
	@Autowired(required=true)
	ITiendaSERVICE tiendaSERVICE;
	
	@Autowired(required=true)
	IUsuarioSERVICE usuarioSERVICE;
	
	@Autowired(required=true)
	IProfileSERVICE profileSERVICE;
	
	@GetMapping("/get_profile_user/{id_user}")
	public Profile get_profile_user(@PathVariable("id_user")String id_user) {
		System.out.println("Entra");
		int id = Integer.parseInt(id_user);
		return profileSERVICE.profileByIdUser(id);
	}
	
	
}
