package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase entidad Recorrido
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@Entity
@Table(name = "recorrido")
public class Recorrido extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1052620026257639367L;
	
	@Id	
	@Column(name = "RECORRIDO_ID")
	@GeneratedValue
	private Long id;
	
	@Column
	private Long nroRecorrido;
	
	@Column
	private Long nroCamion;
	
	@Column
	private Long nroCuenta;
	
	@Column
	private Long remito;
	
	@Column
	private Long nroAcoplado;
	
	@Column
	private Long recorrido;
	
	@Column
	private String horaInicio;
	
	@Column
	private String horaFin;
	
	@Column
	private String fechaInicio;
	
	@Column
	private String FechaFin;
	
	@Column
	private String cantidadTotal;
	
	@Column
	private Long contadorMuestras;

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
	 * @return the nroRecorrido
	 */
	public Long getNroRecorrido() {
		return nroRecorrido;
	}

	/**
	 * @param nroRecorrido the nroRecorrido to set
	 */
	public void setNroRecorrido(Long nroRecorrido) {
		this.nroRecorrido = nroRecorrido;
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
	 * @return the nroCuenta
	 */
	public Long getNroCuenta() {
		return nroCuenta;
	}

	/**
	 * @param nroCuenta the nroCuenta to set
	 */
	public void setNroCuenta(Long nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	/**
	 * @return the remito
	 */
	public Long getRemito() {
		return remito;
	}

	/**
	 * @param remito the remito to set
	 */
	public void setRemito(Long remito) {
		this.remito = remito;
	}

	/**
	 * @return the nroAcoplado
	 */
	public Long getNroAcoplado() {
		return nroAcoplado;
	}

	/**
	 * @param nroAcoplado the nroAcoplado to set
	 */
	public void setNroAcoplado(Long nroAcoplado) {
		this.nroAcoplado = nroAcoplado;
	}

	/**
	 * @return the recorrido
	 */
	public Long getRecorrido() {
		return recorrido;
	}

	/**
	 * @param recorrido the recorrido to set
	 */
	public void setRecorrido(Long recorrido) {
		this.recorrido = recorrido;
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
	 * @return the fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public String getFechaFin() {
		return FechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}

	/**
	 * @return the cantidadTotal
	 */
	public String getCantidadTotal() {
		return cantidadTotal;
	}

	/**
	 * @param cantidadTotal the cantidadTotal to set
	 */
	public void setCantidadTotal(String cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	/**
	 * @return the contadorMuestras
	 */
	public Long getContadorMuestras() {
		return contadorMuestras;
	}

	/**
	 * @param contadorMuestras the contadorMuestras to set
	 */
	public void setContadorMuestras(Long contadorMuestras) {
		this.contadorMuestras = contadorMuestras;
	}
}
