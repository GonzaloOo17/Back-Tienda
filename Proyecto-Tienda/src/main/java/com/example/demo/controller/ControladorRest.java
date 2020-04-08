package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.IAnuncioSERVICE;
import com.example.demo.interfaces.ICategoriaSERVICE;
import com.example.demo.interfaces.IUsuarioSERVICE;
import com.example.demo.model.Anuncio;
import com.example.demo.model.Categoria;
import com.example.demo.model.Usuario;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/rest", produces="application/json")
public class ControladorRest {
	
	@Autowired(required=true)
	IAnuncioSERVICE anuncioSERVICE;
	@Autowired(required=true)
	ICategoriaSERVICE categoriaSERVICE;
	@Autowired(required=true)
	IUsuarioSERVICE usuarioSERVICE;
	
	@GetMapping("/list_anuncios")
	public List<Anuncio> list_anuncios() {
		System.out.println("Entra");
		return anuncioSERVICE.list_anuncios();
	}
	
	//get anuncios by prioridad
	@GetMapping("/anuncios_prioridad")
	public List<Anuncio> list_anuncios_prioridad() {
		System.out.println("Entra");
		return anuncioSERVICE.anuncios_by_prioridad();
	}
	
	@GetMapping("/anuncio/{id_anuncio}")
	public Optional<Anuncio> get_anuncio(@PathVariable("id_anuncio") int id_anuncio) {
		return anuncioSERVICE.get_by_id(id_anuncio);
	}
	
	//get anuncios by categoria
	
	@GetMapping("/anuncios_idCategoria/{id_categoria}")
	public List<Anuncio> get_anuncio_by_categoria(@PathVariable("id_categoria") int id_categoria) {
		System.out.println("Entra");
		return anuncioSERVICE.anuncios_by_categoria(id_categoria);
	}
	
	@GetMapping("/categorias")
	public Iterable<Categoria> list_categorias() {
		return categoriaSERVICE.list_categorias();
	}

	//login/
	@GetMapping("/getUser/{user}")
	public Usuario buscar_user(@PathVariable("user") String user) {
		int id_user = Integer.parseInt(user);
		return usuarioSERVICE.buscar_by_user(id_user);	
	}
	
	@PostMapping("/register")
	public void register(@RequestBody Usuario user) {
		usuarioSERVICE.alta_usuario(user);	
	}
	
	/*@GetMapping("/login/{email}/{password}")
	public boolean login(@PathVariable("email") String email, @PathVariable("password") String password) {

		return usuarioSERVICE.buscar_by_email(email, password);	
	}
	*/
	@PostMapping("/login")
	public String login_post(@RequestBody Usuario user) {

		return Integer.toString(usuarioSERVICE.buscar_by_email(user.getEmail(), user.getPassword()));	
	}

	
	
}
