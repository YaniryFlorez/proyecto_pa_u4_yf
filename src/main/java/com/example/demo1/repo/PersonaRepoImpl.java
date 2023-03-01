package com.example.demo1.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Persona;

@Repository
@Transactional
public class PersonaRepoImpl implements IPersonaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorId(id));
	}

	@Override
	public List<Persona> buscar() {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createNativeQuery(
				"Select * from persona", Persona.class);
		return query.getResultList();
	}

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> query = this.entityManager.createQuery(
				"Select e from Persona e where e.id=:datoId",Persona.class);
		query.setParameter("datoId", id);
		return query.getSingleResult();
	}

}
