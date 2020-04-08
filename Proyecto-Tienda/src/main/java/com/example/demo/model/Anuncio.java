package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="anuncios")
public class Anuncio {
	public Anuncio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Anuncio(int id_anuncio, String user, int id_categoria, String titulo, String descripcion, double precio,
			int prioridad, Date fecha) {
		super();
		this.id_anuncio = id_anuncio;
		this.user = user;
		this.id_categoria = id_categoria;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.prioridad = prioridad;
		this.fecha = fecha;

	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id_anuncio;
	public String user;
	public int id_categoria;
	public String titulo;
	public String descripcion;
	public double precio;
	public int prioridad;
	public Date fecha;

	
	public int getId_anuncio() {
		return id_anuncio;
	}
	public void setId_anuncio(int id_anuncio) {
		this.id_anuncio = id_anuncio;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
