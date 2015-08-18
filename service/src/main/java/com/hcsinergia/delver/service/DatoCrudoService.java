package com.hcsinergia.delver.service;

import java.util.Date;
import java.util.List;

import com.hcsinergia.delver.model.DatoCrudo;

public interface DatoCrudoService {
	
	void persist(DatoCrudo datoCrudo);

	List<DatoCrudo> findEntitiesByDate(Date dateStart, Date dateEnd);
}
