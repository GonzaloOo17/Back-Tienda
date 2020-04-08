package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario,String>{
	public List<Usuario> findByEmail(String email);
	public List<Usuario> findByUser(int id);
}
