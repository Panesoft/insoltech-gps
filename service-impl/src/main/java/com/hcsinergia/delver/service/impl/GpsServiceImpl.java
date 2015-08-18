package com.hcsinergia.delver.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Gps;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.GpsService;

@Service
@Transactional
public class GpsServiceImpl implements GpsService {
	
	@Autowired
	private Dao<Gps> dao;
	
	private static final String MODEM_SEPARATOR = "\\##";
	private static final String NMEA_SEPARATOR = "\\$GP";
	private static final String NMEA = "$GP";
	
	@Override
	public String processEntity(List<String> input) throws BussinessException {
		Gps gps = new Gps();
		if (input != null && !input.isEmpty()) {
			gps.setModem(input.get(0).split(MODEM_SEPARATOR)[1]);
			gps.setParametro(input.get(0).split(MODEM_SEPARATOR)[0]);
			gps.setNmea(NMEA + StringUtils.join(input, ",").split(NMEA_SEPARATOR)[1]);
		}
		gps.fillAuditableData();
		dao.persist(gps);
		return null;
	}

	@Override
	public void persist(Gps gps) {
		dao.persist(gps);
	}

	@Override
	public Gps find(Object key) {
		return dao.find(Gps.class, key);
	}

	@Override
	public Gps update(Gps entity) {
		return dao.update(entity);
	}

	@Override
	public List<Gps> findEntitiesById(Long idStart, Long idEnd) {
		return dao.findEntitiesById(Gps.class, idStart, idEnd);
	}

}
