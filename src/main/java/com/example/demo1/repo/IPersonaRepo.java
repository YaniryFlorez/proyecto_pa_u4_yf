package com.example.demo1.repo;

import java.util.List;

import com.example.demo1.modelo.Persona;

public interface IPersonaRepo {
	public void insertar(Persona persona);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public List<Persona> buscar();
	public Persona buscarPorId(Integer id);

	}
