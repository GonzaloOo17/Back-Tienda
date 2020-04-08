package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Profile;

public interface IProfileRepository extends CrudRepository<Profile, Integer>{
	public Profile findByUser(int id_user);
	public Profile findById(int id_profile);
}
