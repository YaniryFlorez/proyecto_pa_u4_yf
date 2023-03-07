package com.example.demo1.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	  @Id
	  @Column(name="prod_numero_de_barras_maestro")
	    private String numero;
	    
	    @Column(name="prod_nombre")
	    private String nombre;
	    
	    @Column(name="prod_categoria")
	    private String categoria;

		public String getNumero() {
			return numero;
		}
		
		@OneToMany(mappedBy="producto")
		private List<Inventario> inventario;
	    //SET y GET

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public List<Inventario> getInventario() {
			return inventario;
		}

		public void setInventario(List<Inventario> inventario) {
			this.inventario = inventario;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}
		
		
	   	

}
