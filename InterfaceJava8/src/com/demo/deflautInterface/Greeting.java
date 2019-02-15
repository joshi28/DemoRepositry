package com.demo.deflautInterface;

public interface Greeting {
	default String hello() {
		System.out.println("Parent default Interface with return type in called");
		return "Jinal";
		
	}
	default void implementedMethod() {
		System.out.println("in Interface");
	}
}
