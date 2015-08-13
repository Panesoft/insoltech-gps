package com.hcsinergia.delver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Cip;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.CipService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
@Transactional
public class CipServiceImpl implements CipService {
	
	@Autowired
	private Dao<Cip> dao;
	
	/* 
	 * @see com.hcsinergia.delver.service.BaseService#processEntity(java.util.List)
	 */
	@Override
	public String processEntity(List<String> input) throws BussinessException {
		if (input.size() != 14) {
			throw new BussinessException(SIZE_ERROR);
		}
		Cip cip = new Cip();
		cip.setModem(input.get(1));
		cip.setNroCip(!input.get(3).isEmpty() ? Long.valueOf(input.get(3)) : 0);
		cip.setTouridx(input.get(4));
		cip.setNroCamion(!input.get(5).isEmpty() ? Long.valueOf(input.get(5)) : 0);			
		cip.setHoraFin(input.get(6));
		cip.setHoraInicio(input.get(7));
		cip.setFecha(input.get(8));
		cip.setTempaver(input.get(9));
		cip.setTempmin(input.get(10));
		cip.setTempmax(input.get(11));
		cip.setTotalLitros(input.get(12));
		cip.setChkSum(input.get(13));
		cip.fillAuditableData();
		dao.persist(cip);
		return MessageConstants.OK_RESPONSE;
	}

	@Override
	public void persist(Cip cip) {
		dao.persist(cip);
	}

	@Override
	public Cip find(Object key) {		
		return dao.find(Cip.class, key);
	}

	@Override
	public Cip update(Cip entity) {
		return dao.update(entity);
	}

	@Override
	public List<Cip> findEntitiesById(Long idStart, Long idEnd) {
		return dao.findEntitiesById(Cip.class, idStart, idEnd);
	}

}
