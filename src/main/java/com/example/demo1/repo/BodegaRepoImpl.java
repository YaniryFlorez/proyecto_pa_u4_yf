package com.example.demo1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class BodegaRepoImpl implements IBodegaRepo{
	
	@Persistent
	private EntityManager entityManager;
	

	@Override
	public void CrearNuevaB(String numero) {
		// TODO Auto-generated method stub
		this.entityManager.persist(numero);
	}


	@Override
	public Bodega buscarB(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Bodega.class, numero);
	}
	

}
