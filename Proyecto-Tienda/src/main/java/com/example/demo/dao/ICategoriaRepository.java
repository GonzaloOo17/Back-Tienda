package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Categoria;
import com.example.demo.model.Usuario;

public interface ICategoriaRepository extends CrudRepository<Categoria,Integer>{
	
}
