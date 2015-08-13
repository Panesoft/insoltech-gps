package com.hcsinergia.delver.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


/**
 * Clase abstracta de la cual deberán heredar todas las entidades
 * para realizar auditoria
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@MappedSuperclass
public abstract class AuditableEntity {
	
	@Column
	private Date fechaAlta;
	
	@Column
	private Date fechaModificacion;
	
	@Column
	private Date fechaBaja;
	
	public void fillAuditableData() {
		this.fechaAlta = Calendar.getInstance().getTime();
	}

	/**
	 * @return the fechaAlta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the fechaBaja
	 */
	public Date getFechaBaja() {
		return fechaBaja;
	}

	/**
	 * @param fechaBaja the fechaBaja to set
	 */
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
}
