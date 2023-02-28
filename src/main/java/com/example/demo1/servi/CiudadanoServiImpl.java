package com.example.demo1.servi;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Ciudadano;
import com.example.demo1.modelo.Estudiante;
import com.example.demo1.repo.ICiudadanoRepo;
import com.example.demo1.repo.IEstudianteRepo;

@Service
public class CiudadanoServiImpl implements ICiudadanoServi {

	@Autowired
	private ICiudadanoRepo ciudadanoRepo;
	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public List<Ciudadano> consultarTodos() {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.ObtenerCiudadanos();
	}

	@Override
	public void convertir(Ciudadano ciud) {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		estudiante.setNombreCompleto(ciud.getNombre()+" "+ciud.getApellido());
		
		int edad=LocalDateTime.now().getYear() - ciud.getFechaNacimiento().getYear(); 
		estudiante.setEdad(edad);
		
		
		this.estudianteRepo.insertar(estudiante);
	}

}
