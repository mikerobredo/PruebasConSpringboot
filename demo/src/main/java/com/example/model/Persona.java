package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
	@Id
	private int IdPersona;
	@Column(name = "nombre", length = 50)
	private String nombre;
	
	public int GetIdPersona() {
		return IdPersona;
	}
	public String GetNombre()
	{
		return nombre;
	}
	public void SetNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public void SetId(int id) 
	{
		this.IdPersona=id;
	}
}
