package com.demo.deflautInterface;

public class InheritanceProblemDefaultInterface implements Greeting, GreetingExtn {
	@Override
	public String hello() {
		
		return "class default Interface with return method is called";
		
	}
	
	 public void implementedMethod() {
		System.out.println("In class");
		
	}
	public static void main(String[] args) {
		System.out.println(new InheritanceProblemDefaultInterface().hello());
	}

}
