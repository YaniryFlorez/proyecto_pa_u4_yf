package com.example.demo1.repo;

import java.util.List;

import com.example.demo1.modelo.Bodega;
import com.example.demo1.modelo.Inventario;

public interface IInventarioRepo {
   public List<Inventario> crearInventario(String id);
   public void buscarInv(String numero);
   
  
}
