package com.ipartek.formacion.rest.musiconcloud.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ipartek.formacion.rest.musiconcloud.domain.Cancion;
import com.ipartek.formacion.rest.musiconcloud.model.CancionesRepository;

@RestController
public class CancionesController {
	@Autowired
	CancionesRepository cancionesRepository;
	
	@RequestMapping(value="/cancion/",method = RequestMethod.GET)
    public List<Cancion> listar() {
        /*
		ArrayList<Cancion> lista= new ArrayList<Cancion>();
		Cancion cancion= null;

		for (int i = 0; i < 10; i++) {
	
				cancion= new Cancion();
				cancion.setId(i);
				cancion.setNombre("Cancion"+1);
				lista.add(cancion);
				}
		return lista;*/
		
		return (List<Cancion>)cancionesRepository.findAll(); 
		
		/**
		 *  Al lanzar la aplicacion inicializarlo con Boot Dasboard que esta en windows show view 
		 */
		
    }
	
	@RequestMapping(value="/cancion/{id}",method = RequestMethod.GET)
    public Optional<Cancion> detalle(@PathVariable int id) {

        
		/*Cancion cancion = new Cancion();
		cancion.setId(id);
		cancion.setNombre("Cancion"+id);		
		return cancion;*/
		return cancionesRepository.findById(id); //Tienes que poner en public opcional porque puede que te pueda llegar un valor vacio null
    }
	
	@RequestMapping(value="/cancion/{id}",method = RequestMethod.DELETE)
	  public Cancion eliminar (@PathVariable int id) {
	        
			Cancion cancion = new Cancion();
			cancion.setId(id);
			cancion.setNombre("Cancion"+id);		
			return cancion;
	    }
}
