package com.java9s.designpattern.factory;

public class Nokia implements Telefono{
	private int ramSize;
	private String processor;
	public String name = Telefono.NOKIA;
	public Nokia(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Nokia(String processor){
		this.processor = processor;
		this.ramSize =2;
	}
	
}
