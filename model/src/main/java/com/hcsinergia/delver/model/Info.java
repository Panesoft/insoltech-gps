package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase entidad Info
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@Entity
@Table(name = "info")
@XmlRootElement
public class Info extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4936103404393841117L;
	
	@Id
	@Column(name = "INFO_ID")
	@GeneratedValue
	private Long id;
	
	@Column
	private Long nroInfo;
	
	@Column
	private String infono;
	
	@Column
	private String time;
	
	@Column
	private String date;
	
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
	 * @return the nroInfo
	 */
	public Long getNroInfo() {
		return nroInfo;
	}

	/**
	 * @param nroInfo the nroInfo to set
	 */
	public void setNroInfo(Long nroInfo) {
		this.nroInfo = nroInfo;
	}

	/**
	 * @return the infono
	 */
	public String getInfono() {
		return infono;
	}

	/**
	 * @param infono the infono to set
	 */
	public void setInfono(String infono) {
		this.infono = infono;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the String
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param String the String to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
}
