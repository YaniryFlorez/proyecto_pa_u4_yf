package com.example.demo1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ProductoRepoImpl implements IProductoRepo{

	@Persistent
	private EntityManager entityManager;
	
	
	@Override
	public void CrearNuevoP(String numero) {
		// TODO Auto-generated method stub
		this.entityManager.persist(numero);
	}


	@Override
	public Producto buscarP(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, numero);
	}
	
	
	

}
