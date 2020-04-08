package com.example.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAnuncioRepository;
import com.example.demo.dao.ICategoriaRepository;
import com.example.demo.dao.IUsuarioRepository;
import com.example.demo.interfaces.IAnuncioSERVICE;
import com.example.demo.interfaces.ICategoriaSERVICE;
import com.example.demo.interfaces.IUsuarioSERVICE;
import com.example.demo.model.Anuncio;
import com.example.demo.model.Categoria;
import com.example.demo.model.Producto;
import com.example.demo.model.Usuario;

@Service
public class AnuncioSERVICE implements IAnuncioSERVICE{

	@Autowired
	IAnuncioRepository anunciosrepository;
	
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public List<Anuncio> list_anuncios() {
		// TODO Auto-generated method stub
		List<Anuncio> anuncios = (List<Anuncio>) anunciosrepository.findAll();
		
		return anuncios;
	}

	@Override
	public List<Anuncio> list_producto_by_anuncio(int id_anuncio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Anuncio buscar_by_titulo(String titulo) {
		// TODO Auto-generated method stub
		Anuncio anuncio = anunciosrepository.findByTitulo(titulo);
		return anuncio;
	}

	@Override
	public void add_anuncio(Anuncio anuncio) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Anuncio> anuncios_by_categoria_precio(int id_categoria, double precio){
		return anunciosrepository.anuncios_by_categoria_precio(id_categoria,precio);
	}

	@Override
	public List<String> anuncios_by_categoria_precio2(int id_categoria, double precio) {
		// TODO Auto-generated method stub
		return anunciosrepository.anuncios_by_categoria_precio2(id_categoria,precio);
	}

	@Override
	public int numero_anuncios_by_categoria(int id_categoria) {
		String consulta = "FROM Anuncio WHERE id_categoria = :id_categoria";
		entitymanager.createQuery(consulta).setParameter(1, id_categoria).getResultList().size();
		return 0;
	}

	@Override
	public List<Anuncio> anuncios_barra_libre(String cadena) {
		// TODO Auto-generated method stub
		String consulta = "FROM Anuncio WHERE titulo like concat('%',:cadena,'%')";
		List<Anuncio> anuncios = entitymanager.createQuery(consulta).setParameter("cadena", cadena).getResultList();
		
		return null;
	}

	@Override
	public Optional<Anuncio> get_by_id(int id) {
		// TODO Auto-generated method stub
		Optional<Anuncio> anuncio = anunciosrepository.findById(id);
		return anuncio;
	}

	@Override
	public List<Anuncio> anuncios_by_categoria(int id_categoria) {
		// TODO Auto-generated method stub
		
		return anunciosrepository.anuncios_by_categoria(id_categoria);
	}

	@Override
	public List<Anuncio> anuncios_by_prioridad() {
		// TODO Auto-generated method stub
		return anunciosrepository.anuncios_by_prioridad();
	}


	
}
