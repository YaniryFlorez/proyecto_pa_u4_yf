package com.example.demo1.servi;

import java.util.List;

import com.example.demo1.modelo.Ciudadano;

public interface ICiudadanoServi {
	
	public List<Ciudadano> consultarTodos();
	
	public void convertir(Ciudadano ciu);
}
