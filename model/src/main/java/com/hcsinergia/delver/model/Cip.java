package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase entidad Cip
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@Entity
@Table(name = "cip")
public class Cip extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 425718935040474463L;
	
	@Id	
	@Column(name = "CIP_ID")
	@GeneratedValue
	private Long id;
	
	@Column
	private Long nroCip;
	
	@Column
	private Long nroCamion;
	
	@Column
	private String horaInicio;
	
	@Column
	private String horaFin;
	
	@Column
	private String fecha;
	
	@Column
	private String tempaver;
	
	@Column
	private String tempmin;
	
	@Column
	private String tempmax;
	
	@Column
	private String totalLitros;

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
	 * @return the nroCip
	 */
	public Long getNroCip() {
		return nroCip;
	}

	/**
	 * @param nroCip the nroCip to set
	 */
	public void setNroCip(Long nroCip) {
		this.nroCip = nroCip;
	}

	/**
	 * @return the nroCamion
	 */
	public Long getNroCamion() {
		return nroCamion;
	}

	/**
	 * @param nroCamion the nroCamion to set
	 */
	public void setNroCamion(Long nroCamion) {
		this.nroCamion = nroCamion;
	}

	/**
	 * @return the horaInicio
	 */
	public String getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFin
	 */
	public String getHoraFin() {
		return horaFin;
	}

	/**
	 * @param horaFin the horaFin to set
	 */
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the tempaver
	 */
	public String getTempaver() {
		return tempaver;
	}

	/**
	 * @param tempaver the tempaver to set
	 */
	public void setTempaver(String tempaver) {
		this.tempaver = tempaver;
	}

	/**
	 * @return the tempmin
	 */
	public String getTempmin() {
		return tempmin;
	}

	/**
	 * @param tempmin the tempmin to set
	 */
	public void setTempmin(String tempmin) {
		this.tempmin = tempmin;
	}

	/**
	 * @return the tempmax
	 */
	public String getTempmax() {
		return tempmax;
	}

	/**
	 * @param tempmax the tempmax to set
	 */
	public void setTempmax(String tempmax) {
		this.tempmax = tempmax;
	}

	/**
	 * @return the totalLitros
	 */
	public String getTotalLitros() {
		return totalLitros;
	}

	/**
	 * @param totalLitros the totalLitros to set
	 */
	public void setTotalLitros(String totalLitros) {
		this.totalLitros = totalLitros;
	}	
}
