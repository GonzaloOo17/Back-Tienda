package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProfileRepository;
import com.example.demo.dao.ITiendaRepository;
import com.example.demo.interfaces.IProfileSERVICE;
import com.example.demo.model.Profile;
import com.example.demo.model.Tienda;

@Service
public class ProfileSERVICE implements IProfileSERVICE{

	@Autowired
	IProfileRepository profilerepository;
	
	@Autowired
	ITiendaRepository tiendarepository;

	@Override
	public Profile profileByIdUser(int id_user) {
		// TODO Auto-generated method stub
		return profilerepository.findByUser(id_user);
	}

	@Override
	public Tienda tienda_by_profile(int id_profile) {
		Tienda tienda=null;
		try {
			int id_tienda =profilerepository.findById(id_profile).getId_tienda();
			tienda = tiendarepository.findById(id_tienda);
			//usuario=usuariorepository.findById(user).get();
		}catch(Exception e) {
			System.out.println(e);
		}
		return tienda;
	}
	
}
