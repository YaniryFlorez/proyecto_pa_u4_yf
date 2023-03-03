package com.example.demo1.controler;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo1.modelo.Persona;
import com.example.demo1.servi.IPersonaServi;

@Controller
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaServi personaServi;
	
	
    @GetMapping("/nuevaPersona")
    //String por que me retorna un String
	public String paginaNuevaPersona(Persona persona) {
    	
		return "vistaNuevaPersona";
		
    }
    
    @PostMapping("/insertar")
	public String insertarPersona(Persona persona) {
    	this.personaServi.guardar(persona);
		return "guardado";
	}
    @GetMapping("/buscar")
    public String buscarTodos(Model modelo) {
    	List<Persona> lista = this.personaServi.buscarTodos();
    	modelo.addAttribute("personas", lista);
    	return "vistaListaPersonas";
    	
    	
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarPersona(@PathVariable("id") Integer id) {
    	this.personaServi.eliminar(id);
    	return "redirect:/personas/buscar";
    	
    }
    public String buscarPorId(@PathVariable("id") Integer id, Model modelo) {
    	Persona persona = this.personaServi.buscarPorId(id);
    	modelo.addAttribute("persona", persona);
    	return "vistaPersona";
    	
    }
    
    @PutMapping("/actualizar/{id}")
	public String actualizarPorid(@PathVariable("id") Integer id, Persona persona){
		persona.setId(id);
		this.personaServi.actualizar(persona);
		return "redirect:/personas/buscar";
	}
	
}

