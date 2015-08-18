package com.hcsinergia.delver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Recorrido;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.RecorridoService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
@Transactional
public class RecorridoServiceImpl implements RecorridoService{
	
	@Autowired
	private Dao<Recorrido> dao;
	
	/*
	 * @see com.hcsinergia.delver.service.BaseService#processEntity(java.util.List)
	 */
	@Override
	public String processEntity(List<String> input) throws BussinessException {
		if (input.size() != 17) {
			throw new BussinessException(SIZE_ERROR);
		}
		Recorrido recorrido = new Recorrido();
		recorrido.setModem(input.get(1));
		recorrido.setNroRecorrido(!input.get(3).isEmpty() ? Long.valueOf(input.get(3)) : 0);
		recorrido.setTouridx(input.get(4));
		recorrido.setNroCamion(!input.get(5).isEmpty() ? Long.valueOf(input.get(5)) : 0);
		recorrido.setNroCuenta(Long.valueOf(input.get(6)));
		recorrido.setRemito(!input.get(7).isEmpty() ? Long.valueOf(input.get(7)) : 0);
		recorrido.setNroAcoplado(Long.valueOf(input.get(8)));
		recorrido.setRecorrido(!input.get(9).isEmpty() ? Long.valueOf(input.get(9)) : 0);
		recorrido.setHoraInicio(input.get(10));
		recorrido.setHoraFin(input.get(11));
		recorrido.setFechaInicio(input.get(12));
		recorrido.setFechaFin(input.get(13));
		recorrido.setCantidadTotal(input.get(14));
		recorrido.setContadorMuestras(!input.get(15).isEmpty() ? Long.valueOf(input.get(15)) : 0);			
		recorrido.setChkSum(input.get(16));
		recorrido.fillAuditableData();
		dao.persist(recorrido);
		return MessageConstants.OK_RESPONSE;
	}

	@Override
	public void persist(Recorrido recorrido) {
		dao.persist(recorrido);
	}

	@Override
	public Recorrido find(Object key) {
		return dao.find(Recorrido.class, key);
	}

	@Override
	public Recorrido update(Recorrido entity) {
		return dao.update(entity);
	}
	
	@Override
	public List<Recorrido> findEntitiesById(Long idStart, Long idEnd) {
		return dao.findEntitiesById(Recorrido.class, idStart, idEnd);
	}

}
