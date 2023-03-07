package com.example.demo1.servi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Producto;
import com.example.demo1.repo.IProductoRepo;
@Service
public class ProductoServImpl implements IProductoServi{
	
	@Autowired
	private IProductoRepo producRepo;
	

	@Override
	public void CrearNuevoP(String numero) {
		// TODO Auto-generated method stub
		this.producRepo.CrearNuevoP(numero);
	}

	@Override
	public Producto buscarP(String numero) {
		// TODO Auto-generated method stub
		return this.producRepo.buscarP(numero);
	}
	
}
