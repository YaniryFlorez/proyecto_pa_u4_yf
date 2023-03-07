package com.example.demo1.servi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Bodega;
import com.example.demo1.repo.IBodegaRepo;

@Service
public class BodegaServImpl implements IBodegaServi{
	
	@Autowired
	private  IBodegaRepo bodegaRepo;
	

	@Override
	public void CrearNuevaB(String numero) {
		// TODO Auto-generated method stub
		this.bodegaRepo.CrearNuevaB(numero);
	}

	@Override
	public Bodega buscarB(String numero) {
		// TODO Auto-generated method stub
		return this.bodegaRepo.buscarB(numero);
	}

}
