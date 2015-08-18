package com.hcsinergia.delver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Info;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.InfoService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
@Transactional
public class InfoServiceImpl implements InfoService {

	@Autowired
	private Dao<Info> dao;

	/*
	 * @see
	 * com.hcsinergia.delver.service.BaseService#processEntity(java.util.List)
	 */
	@Override
	public String processEntity(List<String> input) throws BussinessException {
		if (input.size() != 9) {
			throw new BussinessException(SIZE_ERROR);
		}
		Info info = new Info();
		info.setModem(input.get(1));
		info.setNroInfo(!input.get(3).isEmpty() ? Long.valueOf(input.get(3))	: 0);
		info.setTouridx(input.get(4));
		info.setInfono(input.get(5));
		info.setTime(input.get(6));
		info.setDate(input.get(7));
		info.setChkSum(input.get(8));
		info.fillAuditableData();
		dao.persist(info);
		return MessageConstants.OK_RESPONSE;
	}

	@Override
	public void persist(Info info) {
		dao.persist(info);
	}

	@Override
	public Info find(Object key) {
		return dao.find(Info.class, key);
	}

	@Override
	public Info update(Info info) {
		return dao.update(info);
	}
	
	@Override
	public List<Info> findEntitiesById(Long idStart, Long idEnd) {
		return dao.findEntitiesById(Info.class, idStart, idEnd);
	}

}
