package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICategoriaRepository;
import com.example.demo.interfaces.ICategoriaSERVICE;
import com.example.demo.model.Categoria;
import com.example.demo.model.Tienda;

@Service
public class CategoriaSERVICE implements ICategoriaSERVICE {

	@Autowired
	ICategoriaRepository categoriarepository;

	@Override
	public Iterable<Categoria> list_categorias() {
		// TODO Auto-generated method stub
		return categoriarepository.findAll();
	}
	
	@Override
	public List<Tienda> list_tiendas_categoria(int id) {
		// TODO Auto-generated method stub
		List<Tienda> tiendas  = null;
		
			Categoria categorias= categoriarepository.findById(id).get();
			tiendas = categorias.getTiendas();
		
		
		return tiendas;
	}


	
	
}
