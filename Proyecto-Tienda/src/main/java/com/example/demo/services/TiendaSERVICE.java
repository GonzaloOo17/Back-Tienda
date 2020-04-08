package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ITiendaRepository;
import com.example.demo.interfaces.ITiendaSERVICE;
import com.example.demo.model.Tienda;

@Service
public class TiendaSERVICE implements ITiendaSERVICE {

	@Autowired
	ITiendaRepository tiendarepository;
	
	@Override
	public List<Tienda> list_tiendas() {
		// TODO Auto-generated method stub
		return (List<Tienda>) tiendarepository.findAll();
	}

	@Override
	public List<Tienda> list_tiendas_categoria(int id_categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tienda> get_by_name(String name) {
		// TODO Auto-generated method stub
		return tiendarepository.findByNombre(name);
	}

	@Override
	public void alta_tienda(Tienda tienda) {
		// TODO Auto-generated method stub
		tiendarepository.save(tienda);
	}

	@Override
	public Tienda getById(String id_tienda) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(id_tienda);
		return tiendarepository.findById(id);
	}

}
