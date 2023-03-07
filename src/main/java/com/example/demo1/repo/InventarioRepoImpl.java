package com.example.demo1.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Inventario;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class InventarioRepoImpl implements IInventarioRepo {
	
	@Persistent
	private EntityManager entityManager;

	@Override
	public List<Inventario> crearInventario(String id) {
		// TODO Auto-generated method stub
		return null;
		
		
	}

	@Override
	public void buscarInv(String numero) {
		// TODO Auto-generated method stub
		this.entityManager.find(Inventario.class, numero);
		
	}

}
