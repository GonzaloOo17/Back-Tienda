package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.ICategoriaSERVICE;
import com.example.demo.interfaces.IProfileSERVICE;
import com.example.demo.interfaces.ITiendaSERVICE;
import com.example.demo.interfaces.IUsuarioSERVICE;
import com.example.demo.model.Tienda;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/rest", produces="application/json")
public class ControladorTiendas {

	@Autowired(required=true)
	ICategoriaSERVICE categoriaSERVICE;
	
	@Autowired(required=true)
	ITiendaSERVICE tiendaSERVICE;
	
	@Autowired(required=true)
	IUsuarioSERVICE usuarioSERVICE;
	@Autowired(required=true)
	IProfileSERVICE profileSERVICE;
	
	
	@GetMapping("/list_tiendas")
	public List<Tienda> list_tiendas() {
		System.out.println("Entra");
		return tiendaSERVICE.list_tiendas();
	}
	
	@GetMapping("/get_tienda/{id_tienda}")
	public Tienda get_tienda(@PathVariable("id_tienda")String id_tienda) {
		System.out.println("Entra");
		return tiendaSERVICE.getById(id_tienda);
	}
	
	@GetMapping("/get_tienda_user/{id_user}")
	public Tienda get_tienda_user(@PathVariable("id_user")String id_user) {
		int id = Integer.parseInt(id_user);
		return profileSERVICE.tienda_by_profile(id);
	}
	
	@GetMapping("/list_tienda/{nombre}")
	public List<Tienda> list_tiendas(@PathVariable("nombre")String nombre) {
		System.out.println("Entra");
		return tiendaSERVICE.get_by_name(nombre);
	}
	
	@GetMapping("/list_tiendas_categoria/{id_categoria}")
	public List<Tienda> list_tiendas_categoria(@PathVariable("id_categoria")String idCat) {
		System.out.println("Entra");
		int id = Integer.parseInt(idCat);
		return categoriaSERVICE.list_tiendas_categoria(id);
	}
	/*
	@GetMapping("/register_tienda")
	public List<Tienda> register_tienda(@RequestBody Tienda tienda) {
		System.out.println("Entra");
		return tiendaSERVICE.get_by_name(tienda);
	}*/
}
