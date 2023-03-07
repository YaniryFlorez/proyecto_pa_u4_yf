package com.example.demo1.repo;

import com.example.demo1.modelo.Bodega;

public interface IBodegaRepo {
    public void CrearNuevaB(String numero);
    public Bodega buscarB(String numero);
    
}
