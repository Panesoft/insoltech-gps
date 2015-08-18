package com.hcsinergia.delver.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.springframework.stereotype.Repository;

/**
 * Implementacion generica de la operaciones 
 * basicas de la capa de persistencia.
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 * @param <T> - Entidad
 */
@Repository
public class Dao<T> {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Persiste la entidad recibida por parametro
	 * 
	 * @param entity
	 */
	public void persist(T entity) {
		entityManager.persist(entity);
	}
	
	/**
	 * Busca una entidad a partir de su clave primaria
	 * 
	 * @param clazz - Class de la entidad a buscar
	 * @param key - Clave primaria de la entidad
	 * @return entidad buscada
	 */
	public T find(Class<T> clazz, Object key) {
		return entityManager.find(clazz, key);
	}
	
	/**
	 * Actualiza en la base de datos una entidad recibida por parametro
	 * 
	 * @param entity - Entidad a actualizar
	 * @return entidad actualizada
	 */
	public T update(T entity) {
		return entityManager.merge(entity);
	}
	
	/**
	 * Retorna una lista de la entidad recibida por parametro
	 * filtrada por dos ID
	 * 
	 * @param clazz
	 * @param idStart
	 * @param idEnd
	 * @return
	 */
	public List<T> findEntitiesById(Class<T> clazz, Long idStart, Long idEnd) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = cb.createQuery(clazz);
		Root<T> t = criteriaQuery.from(clazz);
		criteriaQuery.select(t);
		Metamodel m = entityManager.getMetamodel();
		EntityType<T> entity = m.entity(clazz);
		criteriaQuery.where(cb.between(t.get(entity.getId(Long.class)), idStart, idEnd));
		return entityManager.createQuery(criteriaQuery).getResultList();		
	}
	
	public List<T> findAll(Class<T> clazz) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = cb.createQuery(clazz);
		Root<T> t = criteriaQuery.from(clazz);
		criteriaQuery.select(t);
		return entityManager.createQuery(criteriaQuery).getResultList();		
	}
	
	/** 
	 * @return the {@link EntityManager}
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
