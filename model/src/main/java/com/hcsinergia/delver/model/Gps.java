package com.hcsinergia.delver.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase GPS
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@Entity
@Table(name = "gps")
public class Gps extends AuditableEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -61744170121711592L;
	
	@Id
	@Column(name = "GPS_ID")
	@GeneratedValue
	private Long id;
	
	@Column
	private String modem;
	
	@Column
	private String nmea;
	
	@Column
	private String parametro;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nmea
	 */
	public String getNmea() {
		return nmea;
	}

	/**
	 * @param nmea the nmea to set
	 */
	public void setNmea(String nmea) {
		this.nmea = nmea;
	}

	/**
	 * @return the parametro
	 */
	public String getParametro() {
		return parametro;
	}

	/**
	 * @param parametro the parametro to set
	 */
	public void setParametro(String parametro) {
		this.parametro = parametro;
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
