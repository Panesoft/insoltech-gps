package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase entidad Trasvase
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@Entity
@Table(name = "trasvase")
public class Trasvase extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2539621125701018572L;
	
	@Id	
	@Column(name = "TRASVASE_ID")
	@GeneratedValue
	private Long id;
	
	private int nroTrasvase;
	
	@Column
	private int sourcecomp;
	
	@Column
	private int destcomp;
	
	@Column
	private int trailerno;
	
	@Column
	private String timestart;
	
	@Column
	private String datestart;
	
	@Column
	private String cantidad;

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
	 * @return the sourcecomp
	 */
	public int getSourcecomp() {
		return sourcecomp;
	}

	/**
	 * @param sourcecomp the sourcecomp to set
	 */
	public void setSourcecomp(int sourcecomp) {
		this.sourcecomp = sourcecomp;
	}

	/**
	 * @return the destcomp
	 */
	public int getDestcomp() {
		return destcomp;
	}

	/**
	 * @param destcomp the destcomp to set
	 */
	public void setDestcomp(int destcomp) {
		this.destcomp = destcomp;
	}

	/**
	 * @return the trailerno
	 */
	public int getTrailerno() {
		return trailerno;
	}

	/**
	 * @param trailerno the trailerno to set
	 */
	public void setTrailerno(int trailerno) {
		this.trailerno = trailerno;
	}

	/**
	 * @return the timestart
	 */
	public String getTimestart() {
		return timestart;
	}

	/**
	 * @param timestart the timestart to set
	 */
	public void setTimestart(String timestart) {
		this.timestart = timestart;
	}

	/**
	 * @return the cantidad
	 */
	public String getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the nroTrasvase
	 */
	public int getNroTrasvase() {
		return nroTrasvase;
	}

	/**
	 * @param nroTrasvase the nroTrasvase to set
	 */
	public void setNroTrasvase(int nroTrasvase) {
		this.nroTrasvase = nroTrasvase;
	}

	/**
	 * @return the datestart
	 */
	public String getDatestart() {
		return datestart;
	}

	/**
	 * @param datestart the datestart to set
	 */
	public void setDatestart(String datestart) {
		this.datestart = datestart;
	}
}
