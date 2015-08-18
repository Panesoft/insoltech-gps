package com.hcsinergia.delver.service;

import java.util.List;

import com.hcsinergia.delver.model.Gps;

public interface GpsService extends BaseService {
	
	void persist(Gps gps);

	Gps find(Object key);

	Gps update(Gps entity);

	List<Gps> findEntitiesById(Long idStart, Long idEnd);
}
