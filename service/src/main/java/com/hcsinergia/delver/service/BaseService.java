package com.hcsinergia.delver.service;

import java.util.List;

import com.hcsinergia.delver.exception.BussinessException;

/**
 * Interfaz base que deben extender las interfaces de cada
 * uno de los servicios del socket 
 * para procesar los datos recibidos del modem
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
public interface BaseService {
	
	static final String SIZE_ERROR = "Cantidad incorrecta de datos en el paquete recibido";

	/**
	 * Procesa los datos recibidos del modem
	 * 
	 * @param input - Datos enviados por el modem
	 * @return Acknowledge
	 * @throws BussinessException
	 */
	String processEntity(List<String> input) throws BussinessException;

}
