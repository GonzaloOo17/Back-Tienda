package com.example.demo.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Anuncio;

public interface IAnuncioSERVICE {
	public List<Anuncio> list_anuncios();
	public List<Anuncio> list_producto_by_anuncio(int id_anuncio);
	public void add_anuncio(Anuncio anuncio);
	public Anuncio buscar_by_titulo(String titulo);
	public Optional<Anuncio> get_by_id(int id);
	public List<Anuncio> anuncios_by_categoria_precio(int id_categoria, double precio);
	public List<String> anuncios_by_categoria_precio2(int id_categoria, double precio);
	public int numero_anuncios_by_categoria(int id_categoria);
	public List<Anuncio> anuncios_barra_libre(String cadena);
	public List<Anuncio> anuncios_by_categoria(int id_categoria);
	public List<Anuncio> anuncios_by_prioridad();
	
}
