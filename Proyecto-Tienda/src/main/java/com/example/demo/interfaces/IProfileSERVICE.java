package com.example.demo.interfaces;

import java.util.Optional;

import com.example.demo.model.Profile;
import com.example.demo.model.Tienda;

public interface IProfileSERVICE {
	public Profile profileByIdUser(int id_user);
	Tienda tienda_by_profile(int user);
}
