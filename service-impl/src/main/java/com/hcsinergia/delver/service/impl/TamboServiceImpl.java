package com.hcsinergia.delver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Tambo;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.TamboService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
@Transactional
public class TamboServiceImpl implements TamboService {
	
	@Autowired
	private Dao<Tambo> dao;

	/*
	 * @see com.hcsinergia.delver.service.BaseService#processEntity(java.util.List)
	 */
	@Override
	public String processEntity(List<String> input) throws BussinessException {
		if (input.size() != 27) {
			throw new BussinessException(SIZE_ERROR);
		}
		Tambo tambo = new Tambo();
		tambo.setModem(input.get(1));
		tambo.setNroTambo(!input.get(3).isEmpty() ? Long.valueOf(input.get(3)) : 0);
		tambo.setTouridx(input.get(4));
		tambo.setRemito(!input.get(5).isEmpty() ? Long.valueOf(input.get(5)) : 0);
		tambo.setCodigoTambero(!input.get(6).isEmpty() ? Long.valueOf(input.get(6)) : 0);
		tambo.setHoraFin(input.get(7));
		tambo.setHoraInicio(input.get(8));
		tambo.setFechaInicio(input.get(9));
		tambo.setFechaFin(input.get(10));
		tambo.setCantidadTotal(input.get(11));
		tambo.setCompa(input.get(12).isEmpty() ? Long.valueOf(input.get(12)) : 0);
		tambo.setCantidadA(input.get(13));
		tambo.setCompb(input.get(14).isEmpty() ? Long.valueOf(input.get(14)) : 0);
		tambo.setCantidadB(input.get(15));
		tambo.setCompc(!input.get(16).isEmpty() ? Long.valueOf(input.get(16)) : 0);
		tambo.setCantidadC(input.get(17));			
		tambo.setTempaver(input.get(18));
		tambo.setTempmin(input.get(19));
		tambo.setTempmax(input.get(20));
		tambo.setStatus(input.get(21).isEmpty() ? Long.valueOf(input.get(21)) : 0);
		tambo.setDesaInicial(input.get(22));
		tambo.setDesaFinal(input.get(23));
		tambo.setConstanteE(input.get(24));
		tambo.setConstanteC(input.get(25));			
		tambo.setChkSum(input.get(26));
		tambo.fillAuditableData();
		dao.persist(tambo);
		return MessageConstants.OK_RESPONSE;
	}

	@Override
	public void persist(Tambo tambo) {
		dao.persist(tambo);
	}

	@Override
	public Tambo find(Object key) {
		return dao.find(Tambo.class, key);
	}

	@Override
	public Tambo update(Tambo entity) {
		return dao.update(entity);
	}
	
	@Override
	public List<Tambo> findEntitiesById(Long idStart, Long idEnd) {
		return dao.findEntitiesById(Tambo.class, idStart, idEnd);
	}

}
