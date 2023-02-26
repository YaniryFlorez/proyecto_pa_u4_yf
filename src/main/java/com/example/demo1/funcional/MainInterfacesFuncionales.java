package com.example.demo1.funcional;

import java.util.Arrays;
import java.util.List;

import org.apache.el.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainInterfacesFuncionales {

	private static final Logger LOG = LoggerFactory.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] args) {

		// 1.SUPPLIER
		LOG.info("1.Supplier");
		// Clases

		IPersonaSupplier<String> supplier1 = new PersonaSupplierImpl();
		LOG.info("Supplier Clase: " + supplier1.getNombre());

		// Lamdas
		IPersonaSupplier<String> supplier2 = () -> "Yaniry 2";
		LOG.info("Supplier Lambda: " + supplier2.getNombre());

		IPersonaSupplier<Integer> supplier3 = () -> Integer.valueOf(5);
		LOG.info("Supplier Lambda: " + supplier3.getNombre());

		IPersonaSupplier<Persona> supplier4 = () -> {
			Persona per = new Persona();
			per.setApellido("Florez");
			per.setNombre("Yaniry");
			return per;
		};
		LOG.info("Supplier Lambda: " + supplier4.getNombre());

		IPersonaSupplier<Persona> supplier5 = new PersonaSupplier2Impl();
		LOG.info("Supplier Clase: " + supplier5.getNombre());

		//Java
		LOG.info("JAVA supp");
		//Stream<String>lista=Stream.generate(()->{ return "Yaniry 2"})
		
		
		// 2.Consumer
		LOG.info("2.Consumer");

		// Clase
		IPersonaConsumer<String, Integer> consumer1 = new PersonaConsumerImpl();
		consumer1.accept("Procesa este dato", Integer.valueOf(10));
		// Lambda

		IPersonaConsumer<String, Integer> consumer2 = (cadena, numero) -> {
			LOG.info("mensaje a: " + cadena);
			LOG.info("mensaje b: " + cadena);
			LOG.info("mensaje c: " + numero);
		};
		consumer2.accept("procesa este dato 2", Integer.valueOf(15));

		IPersonaConsumer<Integer, Integer> consumer3 = (valor1, valor2) -> {
			Integer valor3 = valor1.intValue() + valor2.intValue();
			LOG.info("Valor 3 = " + valor3);
		};
		consumer3.accept(Integer.valueOf(5), Integer.valueOf(10));

		//Java
		LOG.info("JAva Consumer");
		List<Integer>listaNumeros =Arrays.asList(1,2,3,4,5,56,78);
		listaNumeros.forEach(numero -> LOG.info("valor"+ numero));
		
		for (Integer val:listaNumeros) 
			
		
		
		// 3.Predicate
		LOG.info("3.Predicate");

		IPersonaPredicate<String> predicate1 = cadena -> cadena.contains("z");
		LOG.info("Predicate: " + predicate1.evaluar("Willanz"));

		IPersonaPredicate<Integer> predicate2 = numero -> {
			if (numero.intValue() > 10) {
				return true;

			} else {
				return false;
			}
		};
		LOG.info("Predicate2: " + predicate2.evaluar(Integer.valueOf(11)));

		// Java
			LOG.info("JAVA predicate");
			//Stream<Integer>listaFiltrada=listaNumeros.stream().filter(numero-> numero>=3);
			//listaFiltrada.forEach(numero -> LOG.info("valor:" +numero));
			
			
		// 4.Function
		LOG.info("4.Function");

		IPersonaFunction<String, Integer> function1 = numero -> "Valor: " + numero.toString();
		LOG.info(function1.aplicar(Integer.valueOf(10)));

		IPersonaFunction<Ciudadano, Persona> function2 = persona -> {
			Ciudadano ciudadano = new Ciudadano();
			ciudadano.setNombreCompleto(persona.getNombre() + " " + persona.getApellido());
			ciudadano.setCiudad("Quito");

			return ciudadano;
		};
		Persona persona = new Persona();
		persona.setApellido("Florez");
		persona.setNombre("Yaniry");
		Ciudadano ciudadanoConvertido = function2.aplicar(persona);
		LOG.info("Ciudadano convertido: " + ciudadanoConvertido);
		
		//JAVA
		LOG.info("JAVA Function");
		//Stream<String>listaCambiada= listaNumeros.stream().map(numerolista ->{
			//Integer valorFinal= numerolista+1;
		//	String cadena="num: "+valorFinal.toString();
		//	return cadena;
		//});
		
		// 5.UnaryOperator
		LOG.info("5.UnaryOperator");
		IPersonaUnaryOperator<String> unaryOperator = cadena -> {
			String cadenaFinal = cadena.concat("-sufijo");
			return cadenaFinal;
		};
		
		LOG.info("Unary Operator: " + unaryOperator.aplicar("Yaniry"));
	}
}
