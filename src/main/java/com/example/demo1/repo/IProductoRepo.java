package com.example.demo1.repo;

import com.example.demo1.modelo.Bodega;
import com.example.demo1.modelo.Producto;

public interface IProductoRepo {

	public void CrearNuevoP(String numero);
	  public Producto buscarP(String numero);
}
