package com.example.demo1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@Column(name = "pers_id")
	private Integer id;
	@Column(name = "pers_nombre")
	private String nomber;
	@Column(name = "pers_apellido")
	private String apellido;
	@Column(name = "pers_cedula")
	private String cedula;
	@Column(name = "pers_genero")
	private String genero;	
	//GET Y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomber() {
		return nomber;
	}
	public void setNomber(String nomber) {
		this.nomber = nomber;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nomber=" + nomber + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", genero=" + genero + "]";
	}
	
	
}
