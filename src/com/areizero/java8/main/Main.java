package com.areizero.java8.main;

public class Main {
	
	private static Main instance;

	public static void main(String[] args) {
		if(instance == null) {
			instance = new Main();
		}
		System.out.println("LAMBDA");
		instance.lambdaPrint();
		// Metodos referencia
		ReferenceMethods.runReferenceMethods();
		// Nuevos metodos Collections (LIST)
		Collections collections = new Collections();
		collections.runCollections();
	}
	
	public void lambdaPrint() {
		// forma clasica
		/*
		IFunctional iFunctional = new IFunctional() {			
			@Override
			public void doSomething(String value) {
				System.out.println(value);
			}
		};
		*/
		// forma lambda
		IFunctional iFunctional = (someValue) -> System.out.println(someValue);  
		iFunctional.doSomething("Lambda print");
		iFunctional = (String someValue) -> {
			System.out.println(someValue + " Modify");
			System.out.println(someValue + " Modify2");
		};
		iFunctional.doSomething("HACER ALGO CON ESTO");
	}
	
}
