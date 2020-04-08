package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.model.Tienda;

public interface ITiendaSERVICE {
	public List<Tienda> list_tiendas();
	public List<Tienda> list_tiendas_categoria(int id_categoria);
	public List<Tienda> get_by_name(String name);
	public Tienda getById(String id_tienda);
	public void alta_tienda(Tienda tienda);
}
