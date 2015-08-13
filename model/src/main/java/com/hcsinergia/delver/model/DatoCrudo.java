package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad que representa el dato recibido por
 * el socket antes de procesarlo.
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@Entity
@Table(name = "datocrudo")
public class DatoCrudo extends AuditableEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String datoCrudo;
	
	@Column
	private String error;
	

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
	 * @return the datoCrudo
	 */
	public String getDatoCrudo() {
		return datoCrudo;
	}

	/**
	 * @param datoCrudo the datoCrudo to set
	 */
	public void setDatoCrudo(String datoCrudo) {
		this.datoCrudo = datoCrudo;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
}
