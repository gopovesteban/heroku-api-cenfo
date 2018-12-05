package com.projects.cloud.herokuapi.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projects.cloud.herokuapi.models.Server;

@RepositoryRestResource(collectionResourceRel = "servers", path = "servers")
public interface ServerRepository extends CrudRepository<Server, Serializable>{

}
