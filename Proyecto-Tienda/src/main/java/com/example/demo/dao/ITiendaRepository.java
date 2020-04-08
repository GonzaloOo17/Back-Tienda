package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Tienda;

public interface ITiendaRepository extends CrudRepository<Tienda, Integer>{

	public List<Tienda> findByNombre(String nombre);
	public Tienda findById(int id_tienda);
}
