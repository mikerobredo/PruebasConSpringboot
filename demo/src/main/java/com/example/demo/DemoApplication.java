package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.service.IPersonaService;
//por que scanbasepacckagers===)=???
@SpringBootApplication(scanBasePackages={
"com.example.mike", "com.example.service", "com.example.*"})
@Component
public class DemoApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	@Autowired
	private IPersonaService service;
	
	

	public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("holacoders");
		LOG.warn("advertencia");
		//no necesitamos esto
		//service = new IPersonaServiceImp();
		service.registrar("paco");
	}

}
