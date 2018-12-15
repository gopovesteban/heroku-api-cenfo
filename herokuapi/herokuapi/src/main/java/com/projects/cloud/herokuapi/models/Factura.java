package com.projects.cloud.herokuapi.models;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="facturas")
public class Factura {

	public Factura(String status, String idPaquete) {
		super();
		this.status = status;
		this.idPaquete = idPaquete;
	}

	@Id 
	private String status;
	
	private String idPaquete;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}
	
	
	
}
