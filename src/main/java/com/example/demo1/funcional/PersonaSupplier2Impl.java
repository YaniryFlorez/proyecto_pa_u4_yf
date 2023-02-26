package com.example.demo1.funcional;

public class PersonaSupplier2Impl implements IPersonaSupplier<Persona>{

	@Override
	public Persona getNombre() {
		// TODO Auto-generated method stub
		Persona per = new Persona();
		per.setApellido("Florez 1");
		per.setNombre("Yaniry 1");
		return per;
	}

}
