package com.example.demo1.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
	
	@Id
	@GeneratedValue(generator = "seq_inv", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_inv", sequenceName = "seq_inv")
	
	  @Column(name="inv_numero_de_barras_maestro")
	    private String numero;
	    
	    @Column(name="inv_nombre")
	    private String nombre;
	    
	    @Column(name="inv_direccion")
	    private String direccion;

		public String getNumero() {
			return numero;
		}
		@ManyToOne
	    @JoinColumn(name = "inv_numero_bodega")
	     private Bodega bodega;
		
		
		@ManyToOne
	    @JoinColumn(name = "inv_codigo_barra_prod")
	     private Producto producto;
		
		   //SET Y GET

		public Bodega getBodega() {
			return bodega;
		}

		public void setBodega(Bodega bodega) {
			this.bodega = bodega;
		}

		public Producto getProducto() {
			return producto;
		}

		public void setProducto(Producto producto) {
			this.producto = producto;
		}

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
	   
}
