package com.areizero.java8.main;

import java.util.ArrayList;
import java.util.Arrays;

public class ReferenceMethods {
	
	public static void runReferenceMethods() {
		System.out.println("\nREFERENCE METHODS");
		// Referencia metodo estatico
		IFunctional iFunctional = ReferenceMethods::staticReferenceMethod;
		iFunctional.doSomething("Metodo referencia estatico");
		// Referencia a metodo de instancia de objeto
		System.out.println("-");
		ReferenceMethods referenceMethods = new ReferenceMethods();
		iFunctional = referenceMethods::referenceMethod;
		iFunctional.doSomething("Metodo referencia instancia objeto");
		// Referencia a constructor
		System.out.println("-");
		IFunctionalForReference iFunctionalForReference = TestClass::new;
		iFunctionalForReference.makeTestClass();
		
		// Ejemplo referencia instancia arbitraria en Array
		System.out.println("-");
		String[] instanceArbitrary = {"object", "instance", "reference", "order"};
		Arrays.sort(instanceArbitrary, String::compareToIgnoreCase);
		ArrayList<String> listInstanceArbitrary = new ArrayList<>(Arrays.asList(instanceArbitrary));
		listInstanceArbitrary.forEach(System.out::println);
	}
	
	private static void staticReferenceMethod(String value) {
		System.out.println("En Metodo Referencia: " + value);
	}
	
	private void referenceMethod(String value) {
		System.out.println("Instancia de objeto: " + value);
	}	
	
}
