package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mike.IPersonaRepo;
		
@Service
public class IPersonaServiceImp implements IPersonaService{
	
	
	@Autowired
	private IPersonaRepo repo;

	@Override
	public void registrar(String nombre) {
		//no lo necesito por el autowire!!
		//repo = new PersonaRepoimp();
		repo.registrar(nombre);
		
	}
	

}
