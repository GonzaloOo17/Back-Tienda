package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria implements Serializable {
	public Categoria(int id_categoria, String descripcion, List<Tienda> tiendas) {
		super();
		this.id_categoria = id_categoria;
		this.descripcion = descripcion;
		this.tiendas = tiendas;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_categoria")
	private int id_categoria;
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_categoria",insertable=false,updatable=false)
	private List<Tienda> tiendas;
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categoria(int id_categoria, String descripcion) {
		super();
		this.id_categoria = id_categoria;
		this.descripcion = descripcion;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/*public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}*/
	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", descripcion=" + descripcion + "]";
	}
	public List<Tienda> getTiendas() {
		return tiendas;
	}
	public void setTiendas(List<Tienda> tiendas) {
		this.tiendas = tiendas;
	}
	

}
