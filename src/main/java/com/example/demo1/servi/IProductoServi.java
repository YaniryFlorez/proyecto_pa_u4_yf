package com.example.demo1.servi;

import com.example.demo1.modelo.Producto;

public interface IProductoServi {
	public void CrearNuevoP(String numero);
	  public Producto buscarP(String numero);
}
