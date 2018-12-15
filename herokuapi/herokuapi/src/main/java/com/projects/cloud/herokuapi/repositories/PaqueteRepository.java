package com.projects.cloud.herokuapi.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projects.cloud.herokuapi.models.Paquete;




@RepositoryRestResource(collectionResourceRel = "paquetes", path = "paquetes")
public interface PaqueteRepository extends CrudRepository<Paquete, Serializable>{

}
