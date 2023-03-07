package com.example.demo1.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="bodega")
public class Bodega {

    @Id
	//@GeneratedValue(generator = "seq_ciud", strategy = GenerationType.SEQUENCE)
	//@SequenceGenerator(allocationSize = 1, name = "seq_ciud", sequenceName = "seq_ciud")
    
    @Column(name="bode_numero")
    private String numero;
    
    @Column(name="bode_nombre")
    private String nombre;
    
    @Column(name="bode_direccion")
    private String direccion;
    
    @Column(name="bode_telefono")
    private String telefono;
    
    @OneToMany(mappedBy ="bodega")
	private List<Inventario> inventario;

	public String getNumero() {
		return numero;
	}

    // set y get
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}
    


	

}


