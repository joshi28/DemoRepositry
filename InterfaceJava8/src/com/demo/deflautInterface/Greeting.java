package com.demo.deflautInterface;

public interface Greeting {
	default String hello() {
		System.out.println("Parent default Interface with return method");
		return "Jinal";
		
	}

}
