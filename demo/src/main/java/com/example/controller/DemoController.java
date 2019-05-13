package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



import com.example.repo.IPersonaRepo;
import com.example.model.Persona;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greetings")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        
	        
	        Persona p = new Persona();
	        p.SetId(1);
	        p.SetNombre("miguelito");
	        repo.save(p);
	        
	        model.addAttribute("name", name);
	        return "greetings";
	    }

}
