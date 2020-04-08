package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="tiendas")
public class Tienda{
	public Tienda(int id_tienda, String nombre, int id_categoria, Categoria categoria, String img, int profile,
			String propietario, int id_stock, String descripcion) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.id_categoria = id_categoria;
		this.categoria = categoria;
		this.img = img;
		this.profile = profile;
		this.propietario = propietario;
		this.id_stock = id_stock;
		this.descripcion = descripcion;
	}
	public Tienda(int id_tienda, String nombre, int id_categoria, Categoria categoria,
			int profile, String propietario, int id_stock, String descripcion) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.id_categoria = id_categoria;
		this.categoria = categoria;
		this.profile = profile;
		this.propietario = propietario;
		this.id_stock = id_stock;
		this.descripcion = descripcion;
	}
	public Tienda(int id_tienda, String nombre, int profile, String propietario, int id_stock, String descripcion) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.profile = profile;
		this.propietario = propietario;
		this.id_stock = id_stock;
		this.descripcion = descripcion;
	}
	public Tienda(int id_tienda, String nombre, Usuario usuario, String propietario, int id_stock, String descripcion,
			int profile) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.propietario = propietario;
		this.id_stock = id_stock;
		this.descripcion = descripcion;
		this.profile = profile;
	}
	public Tienda(int id_tienda, String nombre, Usuario usuario, String propietario, int id_stock, String descripcion) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.propietario = propietario;
		this.id_stock = id_stock;
		this.descripcion = descripcion;
	}
	public Tienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tienda(int id_tienda, String nombre, String propietario, int id_stock, String descripcion) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.propietario = propietario;
		this.id_stock = id_stock;
		this.descripcion = descripcion;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_tienda;
	private String nombre;
	
	private int id_categoria;
	
	@ManyToOne
	@JoinColumn(name="id_categoria",insertable=false,updatable=false)
	private Categoria categoria;
	
	private String img;
	
	private int profile;
	private String propietario;
	private int id_stock;
	private String descripcion;

	public int getId_tienda() {
		return id_tienda;
	}
	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public int getId_stock() {
		return id_stock;
	}
	public void setId_stock(int id_stock) {
		this.id_stock = id_stock;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getProfile() {
		return profile;
	}
	public void setProfile(int profile) {
		this.profile = profile;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
}
