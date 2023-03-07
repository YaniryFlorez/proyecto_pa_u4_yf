package com.example.demo1.servi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Inventario;
import com.example.demo1.repo.IInventarioRepo;

@Service
public class InventarioServImpl implements IInventarioServi{
	
	@Autowired
    private IInventarioRepo inventRepo;
	
	@Override
	public List<Inventario> crearInventario(String id) {
		// TODO Auto-generated method stub
		return this.inventRepo.crearInventario(id);
	}

	@Override
	public void buscarInv(String numero) {
		// TODO Auto-generated method stub
		this.inventRepo.buscarInv(numero);
	}

}
