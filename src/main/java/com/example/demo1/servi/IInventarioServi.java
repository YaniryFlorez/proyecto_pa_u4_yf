package com.example.demo1.servi;

import java.util.List;

import com.example.demo1.modelo.Inventario;

public interface IInventarioServi {
	   public List<Inventario> crearInventario(String id);
	   public void buscarInv(String numero);
}
