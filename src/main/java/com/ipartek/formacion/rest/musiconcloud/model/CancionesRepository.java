package com.ipartek.formacion.rest.musiconcloud.model;

import org.springframework.data.repository.CrudRepository;

import com.ipartek.formacion.rest.musiconcloud.domain.Cancion;
import java.lang.String;
import java.util.List;

public interface CancionesRepository extends CrudRepository<Cancion, Integer>{

	
List<Cancion> findByNombreContaining(String nombre);
}
