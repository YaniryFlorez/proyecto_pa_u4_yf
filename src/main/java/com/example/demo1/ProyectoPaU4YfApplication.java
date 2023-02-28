package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo1.modelo.Ciudadano;
import com.example.demo1.servi.ICiudadanoServi;

@SpringBootApplication
public class ProyectoPaU4YfApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU4YfApplication.class, args);
	}

	@Autowired
	private ICiudadanoServi ciudadanoServi;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		procesarEstudiantesParalelo();
	}
	
	public void procesarEstudiantesParalelo() {
		long tiempoInicial= System.currentTimeMillis();
		List<Ciudadano> listaCiudadanos = new ArrayList<>();
		listaCiudadanos = this.ciudadanoServi.consultarTodos();
				
		listaCiudadanos .parallelStream().forEach(ciud -> this.ciudadanoServi.convertir(ciud));		 
		long tiempoFinal= System.currentTimeMillis();
		long tiempoTotal= (tiempoFinal-tiempoInicial);
		
		System.out.println("tiempo total transcurrido: "+tiempoTotal);
	}
}
