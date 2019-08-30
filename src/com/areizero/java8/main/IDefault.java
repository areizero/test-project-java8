package com.areizero.java8.main;

public interface IDefault {
	
	default public void doSomething() {
		System.err.print("COMPORTAMIENTO DEFECTO");
	}
}
