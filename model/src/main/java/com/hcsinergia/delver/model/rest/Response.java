package com.hcsinergia.delver.model.rest;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import com.hcsinergia.delver.model.AuditableEntity;
import com.hcsinergia.delver.model.Cip;
import com.hcsinergia.delver.model.DatoCrudo;
import com.hcsinergia.delver.model.Gps;
import com.hcsinergia.delver.model.Info;
import com.hcsinergia.delver.model.Recorrido;
import com.hcsinergia.delver.model.Tambo;
import com.hcsinergia.delver.model.Trasvase;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7471847462525176615L;

	@XmlElements({ 
			@XmlElement(name = "info", type = Info.class),	@XmlElement(name = "recorrido", type = Recorrido.class),
			@XmlElement(name = "tambo", type = Tambo.class), @XmlElement(name = "cip", type = Cip.class),
			@XmlElement(name = "trasvase", type = Trasvase.class), @XmlElement(name = "gps", type = Gps.class), @XmlElement(name = "datocrudo", type = DatoCrudo.class) })
	@XmlElementWrapper
	private List<? extends AuditableEntity> entities;
	
	private String message;
	
	private Integer status;

	/**
	 * @return the entities
	 */
	public List<? extends AuditableEntity> getEntities() {
		return entities;
	}

	/**
	 * @param entities
	 *            the entities to set
	 */
	public void setEntities(List<? extends AuditableEntity> entities) {
		this.entities = entities;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}
