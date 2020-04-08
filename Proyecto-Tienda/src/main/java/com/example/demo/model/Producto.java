package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@Column(name="id_producto")
	private int id_producto;
	@Column(name="id_categoria")
	private int id_categoria;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precio")
	private int precio;
	@Column(name="stock")
	private int stock;
	
	@ManyToOne
	@JoinColumn(name="id_categoria",insertable=false,updatable=false)
	private Categoria categoria;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Producto(int id_producto, String descripcion, int precio) {
		super();
		this.id_producto = id_producto;
		this.descripcion = descripcion;
		this.precio = precio;
	}	


	public Producto(int id_producto, String descripcion, int precio, int stock) {
		super();
		this.id_producto = id_producto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}

	public Producto(int id_producto, int id_categoria, String descripcion, int precio, int stock) {
		super();
		this.id_producto = id_producto;
		this.id_categoria = id_categoria;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", id_categoria=" + id_categoria + ", descripcion="
				+ descripcion + ", precio=" + precio + ", stock=" + stock + "]";
	}
	

}
