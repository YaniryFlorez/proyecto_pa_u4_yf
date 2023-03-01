package com.example.demo1.servi;

import java.util.List;

import com.example.demo1.modelo.Persona;

public interface IPersonaService {
	public void guardar(Persona persona);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public List<Persona> buscarTodos();
	public Persona buscarPorId(Integer id);
}
