package com.example.mike;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.DemoApplication;


@Repository
public class PersonaRepoimp implements IPersonaRepo{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("se registro a "+ nombre);
	}

}
