package com.projects.cloud.herokuapi.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projects.cloud.herokuapi.models.Factura;


@RepositoryRestResource(collectionResourceRel = "facturas", path = "facturas")
public interface FacturaRepository extends CrudRepository<Factura, Serializable>{

}

