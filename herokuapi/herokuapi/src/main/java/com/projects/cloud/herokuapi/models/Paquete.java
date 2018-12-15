package com.projects.cloud.herokuapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="paquetes")
public class Paquete {

	public Paquete(String id, String aerolinea, String vuelo, String fecha, String nombreConsignatario,
			String cuentaConsignatario, String montoFactura, String nombreTienda) {
		super();
		this.id = id;
		this.aerolinea = aerolinea;
		this.vuelo = vuelo;
		this.fecha = fecha;
		this.nombreConsignatario = nombreConsignatario;
		this.cuentaConsignatario = cuentaConsignatario;
		this.montoFactura = montoFactura;
		this.nombreTienda = nombreTienda;
	}
	@Id
	private String id;
	
	private String aerolinea;
	private String vuelo;
	private String fecha;
	private String nombreConsignatario;
	private String cuentaConsignatario;
	private String montoFactura;
	private String nombreTienda;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getVuelo() {
		return vuelo;
	}
	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNombreConsignatario() {
		return nombreConsignatario;
	}
	public void setNombreConsignatario(String nombreConsignatario) {
		this.nombreConsignatario = nombreConsignatario;
	}
	public String getCuentaConsignatario() {
		return cuentaConsignatario;
	}
	public void setCuentaConsignatario(String cuentaConsignatario) {
		this.cuentaConsignatario = cuentaConsignatario;
	}
	public String getMontoFactura() {
		return montoFactura;
	}
	public void setMontoFactura(String montoFactura) {
		this.montoFactura = montoFactura;
	}
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	
	
}
