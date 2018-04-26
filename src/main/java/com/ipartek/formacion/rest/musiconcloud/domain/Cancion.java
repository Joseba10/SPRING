package com.ipartek.formacion.rest.musiconcloud.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="cancion")

public class Cancion {
	@Id //Identificador
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement en base de datos
	int id;
	@NotBlank //Que no sea vacio
	@Basic //No hace falta poner igual que el column pero de esta manera es mas especifico y asi no permite nulo
	@Column(name="nombre",nullable=false,unique=true)
	String nombre;

	public Cancion() {
		super();
		this.id = 0;
		this.nombre = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombre=" + nombre + "]";
	}

}
