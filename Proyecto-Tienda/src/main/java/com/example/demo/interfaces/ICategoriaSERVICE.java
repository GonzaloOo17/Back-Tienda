package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.model.Categoria;
import com.example.demo.model.Tienda;

public interface ICategoriaSERVICE {
	public Iterable<Categoria> list_categorias();
	public List<Tienda> list_tiendas_categoria(int id);
}
