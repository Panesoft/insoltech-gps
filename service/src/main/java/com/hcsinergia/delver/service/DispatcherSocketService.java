package com.hcsinergia.delver.service;

/**
 * Dispatcher de servicios implementados por el socket
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
public interface DispatcherSocketService {
	
	/**
	 * Procesa los datos crudos recibidos por el modem
	 * y despacha el pedido al servicio correspondiente
	 * segun el tipo de dato
	 * 
	 * @param input - Datos crudos recibidos por modem
	 * @return Aknowledge
	 */
	String processRequestClient(String input);

}
