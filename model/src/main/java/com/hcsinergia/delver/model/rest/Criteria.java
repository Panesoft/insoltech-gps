package com.hcsinergia.delver.model.rest;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Criteria XML recibido por el servicio rest
 * 
 *<criteria>
 * <user>username</user>
 * <password>password</password>
 * <entity>info</entity>
 * <idStart>1</idStart>
 * <idEnd>15</idEnd>
 *</criteria>
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Criteria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4375264995553067202L;

	private String user;
	
	private String password;
	
	private String entity;
	
	private Long idStart;
	
	private Long idEnd;
	
	private Date dateStart;
	
	private Date dateEnd;

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the entity
	 */
	public String getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public void setEntity(String entity) {
		this.entity = entity;
	}

	/**
	 * @return the idStart
	 */
	public Long getIdStart() {
		return idStart;
	}

	/**
	 * @param idStart the idStart to set
	 */
	public void setIdStart(Long idStart) {
		this.idStart = idStart;
	}

	/**
	 * @return the idEnd
	 */
	public Long getIdEnd() {
		return idEnd;
	}

	/**
	 * @param idEnd the idEnd to set
	 */
	public void setIdEnd(Long idEnd) {
		this.idEnd = idEnd;
	}

	/**
	 * @return the dateStart
	 */
	public Date getDateStart() {
		return dateStart;
	}

	/**
	 * @param dateStart the dateStart to set
	 */
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	/**
	 * @return the dateEnd
	 */
	public Date getDateEnd() {
		return dateEnd;
	}

	/**
	 * @param dateEnd the dateEnd to set
	 */
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
}
