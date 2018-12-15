package com.projects.cloud.herokuapi.models;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="facturas")
public class Factura {

	public Factura(String id,String idPaquete,String status ) {
		super();
		this.id = id;
		this.idPaquete = idPaquete;
		this.status = status;
	}

	@Id 
	private String id;
	
	private String idPaquete;
	
	private String status;
	
	
	

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
