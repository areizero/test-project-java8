package com.areizero.java8.main;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	private List<String> list;

	public Collections() {
		System.out.println("\nCOLLECTIONS");
		list = new ArrayList<>();
		list.add("Valores");
		list.add("De");
		list.add("Ejemplo");
	}

	public void runCollections() {
		// forEach
		list.forEach(System.out::println);
		// removeif
		System.out.println("-");
		list.add("Ejemplo2");
		list.add("Ejemplo3");
		list.removeIf(x -> x.equals("Ejemplo2"));
		list.forEach(System.out::println);		
		// sort (ordenar de mas pequeños a mas grandes)
		System.out.println("-");
		list.sort((x,y) -> x.length() - y.length());
		list.forEach(System.out::println);
	}
}
