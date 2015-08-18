package com.hcsinergia.delver.service.impl;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.DatoCrudo;
import com.hcsinergia.delver.service.BaseService;
import com.hcsinergia.delver.service.DatoCrudoService;
import com.hcsinergia.delver.service.DispatcherSocketService;
import com.hcsinergia.delver.service.GpsService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
public class DispatcherSocketServiceImpl implements DispatcherSocketService {
	
	private static final int ENTITY_POSITION = 2;
	private static final String APPEND_SERVICE_IMPL = "ServiceImpl";
	private static final String SEPARATOR = ",";
	
	@Autowired
	private DatoCrudoService datoCrudoService;
	
	private static final Logger logger = Logger.getLogger(DispatcherSocketServiceImpl.class);
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private GpsService gpsService;
	
	/*
	 * @see com.hcsinergia.delver.service.DispatcherSocketService#processRequestClient(java.lang.String)
	 */
	@Override
	public String processRequestClient(String input) {

		DatoCrudo datoCrudo = new DatoCrudo();
		try {
			logger.info("Dato recibido: " + input);
			List<String> data = Arrays.asList(input.split(SEPARATOR));
			if (data.size() == 1 && (data.get(0).equals(MessageConstants.ATO_CONNECT) || data.get(0).equals(MessageConstants.AT_CONNECT))) {
				return MessageConstants.OK_RESPONSE;
			}
			if (!data.isEmpty() && !data.get(0).equals(MessageConstants.HEADER_REQUEST)) {
				return gpsService.processEntity(data);
			}
			this.checkSum(data, input);
			logger.info("Entity: " + data.get(ENTITY_POSITION).toUpperCase());
			String bean = data.get(ENTITY_POSITION).toLowerCase() + APPEND_SERVICE_IMPL;
			BaseService service = (BaseService) context.getBean(bean);
			return service.processEntity(data);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			datoCrudo.setError(MessageConstants.ERROR_RESPONSE);
			return MessageConstants.ERROR_RESPONSE;
		} finally {
			try {
				datoCrudo.setDatoCrudo(input);
				datoCrudo.fillAuditableData();
				datoCrudoService.persist(datoCrudo);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
	}
	
	private void checkSum (List<String> data, String input) throws BussinessException {
			String checkSum = data.get(data.size() - 1);
			logger.info("checkSum: " + checkSum);
			
			int sumBytes = getCheckSum(input);	
			int decimalCheckSum = Integer.parseInt(checkSum.substring(2, checkSum.length()), 16);
			logger.info("Decimal checkSum: " + decimalCheckSum);
			if (decimalCheckSum != sumBytes) {
				throw new BussinessException("CheckSum incorrecto");
			}
	}
	
	private Integer getCheckSum(String input) {
		byte[] bytes = input.getBytes();
		Integer sumBytes = 0;
		for (int i = 0; i < bytes.length - 6; i++) {
			sumBytes += bytes[i];			
		}
		return sumBytes;
	}
}
