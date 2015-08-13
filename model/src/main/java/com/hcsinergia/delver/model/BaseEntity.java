package com.hcsinergia.delver.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Clase abstracta de la cual extenderan todos los tipos de entidadades
 * 
 * TAMBO
 * INFO
 * TRASVASE
 * CIP
 * RECORRIDO
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@MappedSuperclass
public abstract class BaseEntity extends AuditableEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1511699056793485100L;
	
	@Column
	private String touridx;
	
	@Column
	private String modem;
	
	@Column
	private String chkSum;
	
	/**
	 * @return the touridx
	 */
	public String getTouridx() {
		return touridx;
	}

	/**
	 * @param touridx the touridx to set
	 */
	public void setTouridx(String touridx) {
		this.touridx = touridx;
	}
	
	/**
	 * @return the checksum
	 */
	public String getChkSum() {
		return chkSum;
	}

	/**
	 * @param checksum the checksum to set
	 */
	public void setChkSum(String chkSum) {
		this.chkSum = chkSum;
	}

	/**
	 * @return the modem
	 */
	public String getModem() {
		return modem;
	}

	/**
	 * @param modem the modem to set
	 */
	public void setModem(String modem) {
		this.modem = modem;
	}
}
