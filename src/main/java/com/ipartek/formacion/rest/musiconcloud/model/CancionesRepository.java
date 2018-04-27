package com.ipartek.formacion.rest.musiconcloud.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ipartek.formacion.rest.musiconcloud.domain.Cancion;

public interface CancionesRepository extends CrudRepository<Cancion, Integer>,JpaRepository<Cancion, Integer>{

}
