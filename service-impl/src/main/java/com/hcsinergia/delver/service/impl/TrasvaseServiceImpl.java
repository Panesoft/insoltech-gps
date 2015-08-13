package com.hcsinergia.delver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Trasvase;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.TrasvaseService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
@Transactional
public class TrasvaseServiceImpl implements TrasvaseService {
	
	@Autowired
	private Dao<Trasvase> dao;
	
	@Override
	public String processEntity(List<String> input) throws BussinessException {
		if (input.size() != 12) {
			throw new BussinessException(SIZE_ERROR);
		}
		Trasvase trasvase = new Trasvase();
		trasvase.setModem(input.get(1));
		trasvase.setNroTrasvase(!input.get(3).isEmpty() ? Integer.valueOf(input.get(3)) : 0);
		trasvase.setTouridx(input.get(4));
		trasvase.setSourcecomp(!input.get(5).isEmpty() ? Integer.valueOf(input.get(5)) : 0);
		trasvase.setDestcomp(!input.get(6).isEmpty() ? Integer.valueOf(input.get(6)) : 0);
		trasvase.setTrailerno(!input.get(7).isEmpty() ? Integer.valueOf(input.get(7)) : 0);
		trasvase.setTimestart(input.get(8));
		trasvase.setDatestart(input.get(9));
		trasvase.setCantidad(input.get(10));
		trasvase.setChkSum(input.get(11));
		trasvase.fillAuditableData();
		dao.persist(trasvase);
		return MessageConstants.OK_RESPONSE;
	}

	@Override
	public void persist(Trasvase trasvase) {
		dao.persist(trasvase);		
	}

	@Override
	public Trasvase find(Object key) {
		return dao.find(Trasvase.class, key);
	}

	@Override
	public Trasvase update(Trasvase trasvase) {
		return dao.update(trasvase);
	}
	
	@Override
	public List<Trasvase> findEntitiesById(Long idStart, Long idEnd) {
		return dao.findEntitiesById(Trasvase.class, idStart, idEnd);
	}
}
