package com.hcsinergia.delver.service;

import java.util.List;

import com.hcsinergia.delver.model.Trasvase;

public interface TrasvaseService extends BaseService {
	
	void persist(Trasvase trasvase);

	Trasvase find(Object key);

	Trasvase update(Trasvase entity);

	List<Trasvase> findEntitiesById(Long idStart, Long idEnd);
}
