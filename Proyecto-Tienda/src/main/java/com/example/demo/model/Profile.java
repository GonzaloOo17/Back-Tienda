package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profiles")
public class Profile{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Profile(int id_profile,  int user, String name, String surname, String img, String description,
			int id_tienda) {
		super();
		this.id_profile = id_profile;
		
		this.user = user;
		this.name = name;
		this.surname = surname;
		this.img = img;
		this.description = description;
		this.id_tienda = id_tienda;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id_profile;
	
	public int user;
	public String name;
	public String surname;
	public String img;
	public String description;
	public int id_tienda;
	public int getId_profile() {
		return id_profile;
	}
	public void setId_profile(int id_profile) {
		this.id_profile = id_profile;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int idUser) {
		this.user = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId_tienda() {
		return id_tienda;
	}
	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}
	
	
}
