package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase entidad Tambo
 * 
 * @author joaquin.larranaga@hcsinergia.com
 *
 */
@Entity
@Table(name = "tambo")
public class Tambo extends BaseEntity {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 435924898817920725L;
	
	@Id
	@Column(name = "TAMBO_ID")
	@GeneratedValue
	private Long id;
	
	@Column
	private Long nroTambo;
	
	@Column	
	private Long remito;
	
	@Column
	private Long codigoTambero;
	
	@Column
	private String horaInicio;
	
	@Column
	private String horaFin;
	
	@Column
	private String fechaInicio;
	
	@Column
	private String fechaFin;
	
	@Column
	private String cantidadTotal;
	
	@Column
	private Long compa;
	
	@Column
	private String cantidadA;
	
	@Column
	private Long compb;
	
	@Column
	private String cantidadB;
	
	@Column
	private Long compc;
	
	@Column
	private String cantidadC;
	
	@Column
	private String tempaver;
	
	@Column
	private String tempmin;
	
	@Column
	private String tempmax;
	
	@Column
	private Long status;
	
	@Column
	private String desaInicial;
	
	@Column
	private String desaFinal;
	
	@Column
	private String constanteE;
	
	@Column
	private String constanteC;
	

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
	 * @return the nroTambo
	 */
	public Long getNroTambo() {
		return nroTambo;
	}

	/**
	 * @param nroTambo the nroTambo to set
	 */
	public void setNroTambo(Long nroTambo) {
		this.nroTambo = nroTambo;
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
	 * @return the codigoTambero
	 */
	public Long getCodigoTambero() {
		return codigoTambero;
	}

	/**
	 * @param codigoTambero the codigoTambero to set
	 */
	public void setCodigoTambero(Long codigoTambero) {
		this.codigoTambero = codigoTambero;
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
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
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
	 * @return the compa
	 */
	public Long getCompa() {
		return compa;
	}

	/**
	 * @param compa the compa to set
	 */
	public void setCompa(Long compa) {
		this.compa = compa;
	}

	/**
	 * @return the cantidadA
	 */
	public String getCantidadA() {
		return cantidadA;
	}

	/**
	 * @param cantidadA the cantidadA to set
	 */
	public void setCantidadA(String cantidadA) {
		this.cantidadA = cantidadA;
	}

	/**
	 * @return the compb
	 */
	public Long getCompb() {
		return compb;
	}

	/**
	 * @param compb the compb to set
	 */
	public void setCompb(Long compb) {
		this.compb = compb;
	}

	/**
	 * @return the cantidadB
	 */
	public String getCantidadB() {
		return cantidadB;
	}

	/**
	 * @param cantidadB the cantidadB to set
	 */
	public void setCantidadB(String cantidadB) {
		this.cantidadB = cantidadB;
	}

	/**
	 * @return the compc
	 */
	public Long getCompc() {
		return compc;
	}

	/**
	 * @param compc the compc to set
	 */
	public void setCompc(Long compc) {
		this.compc = compc;
	}

	/**
	 * @return the cantidadC
	 */
	public String getCantidadC() {
		return cantidadC;
	}

	/**
	 * @param cantidadC the cantidadC to set
	 */
	public void setCantidadC(String cantidadC) {
		this.cantidadC = cantidadC;
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
	 * @return the status
	 */
	public Long getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

	/**
	 * @return the desaInicial
	 */
	public String getDesaInicial() {
		return desaInicial;
	}

	/**
	 * @param desaInicial the desaInicial to set
	 */
	public void setDesaInicial(String desaInicial) {
		this.desaInicial = desaInicial;
	}

	/**
	 * @return the desaFinal
	 */
	public String getDesaFinal() {
		return desaFinal;
	}

	/**
	 * @param desaFinal the desaFinal to set
	 */
	public void setDesaFinal(String desaFinal) {
		this.desaFinal = desaFinal;
	}

	/**
	 * @return the constanteE
	 */
	public String getConstanteE() {
		return constanteE;
	}

	/**
	 * @param constanteE the constanteE to set
	 */
	public void setConstanteE(String constanteE) {
		this.constanteE = constanteE;
	}

	/**
	 * @return the constanteC
	 */
	public String getConstanteC() {
		return constanteC;
	}

	/**
	 * @param constanteC the constanteC to set
	 */
	public void setConstanteC(String constanteC) {
		this.constanteC = constanteC;
	}
	
}
