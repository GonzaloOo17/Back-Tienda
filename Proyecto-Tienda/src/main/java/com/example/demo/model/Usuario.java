package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="usuarios")
public class Usuario {
	public Usuario(int user, String password, String email, int id_tienda, int id_profile) {
		super();
		this.user = user;
		this.password = password;
		this.email = email;
		this.id_tienda = id_tienda;

		this.profile = id_profile;
	}
	public Usuario(int user, String password, String email, int id_tienda) {
		super();
		this.user = user;
		this.password = password;
		this.email = email;
		this.id_tienda = id_tienda;

	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user;
	//@Column(name="password")
	private String password;
	//@Column(name="email")
	private String email;
	private int id_tienda;
	
	private int profile;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int user, String password, String email) {
		super();
		this.user = user;
		this.password = password;
		this.email = email;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Usuario [user=" + user + ", password=" + password + ", email=" + email + ", id_tienda=" + id_tienda
				+ ", id_profile=" + profile + "]";
	}
	public int getId_tienda() {
		return id_tienda;
	}
	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}
	
	public int getProfile() {
		return profile;
	}
	public void setProfile(int id_profile) {
		this.profile = id_profile;
	}

	

}
