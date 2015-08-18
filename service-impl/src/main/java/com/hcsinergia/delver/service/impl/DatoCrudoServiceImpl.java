package com.hcsinergia.delver.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcsinergia.delver.model.DatoCrudo;
import com.hcsinergia.delver.persistence.DatoCrudoDao;
import com.hcsinergia.delver.service.DatoCrudoService;

@Service
@Transactional
public class DatoCrudoServiceImpl implements DatoCrudoService {
	
	@Autowired
	private DatoCrudoDao dao;
	
	@Override
	public void persist(DatoCrudo datoCrudo) {
		dao.persist(datoCrudo);
	}
	
	@Override
	public List<DatoCrudo> findEntitiesByDate(Date dateStart, Date dateEnd) {
		return dao.findDatoCrudoByDate(dateStart, dateEnd);
	}

}