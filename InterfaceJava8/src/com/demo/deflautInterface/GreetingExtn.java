package com.demo.deflautInterface;

public interface GreetingExtn extends Greeting {
	@Override
	default String hello() {
		
		return "Child default Interface with return method";
		
	}
}
