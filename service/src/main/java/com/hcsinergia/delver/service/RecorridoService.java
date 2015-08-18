package com.hcsinergia.delver.service;

import java.util.List;

import com.hcsinergia.delver.model.Recorrido;

public interface RecorridoService extends BaseService{
	
	void persist(Recorrido recorrido);

	Recorrido find(Object key);

	Recorrido update(Recorrido entity);

	List<Recorrido> findEntitiesById(Long idStart, Long idEnd);
	
}
