package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Categoria;
import com.example.demo.model.Producto;
import com.example.demo.model.Usuario;

public interface IProductoRepository extends CrudRepository<Producto,Integer>{

}
