package com.java9s.designpattern.factory;

public class iPhone implements Telefono{
	private int ramSize;
	private String processor;
	private String GPU;
        
	public iPhone(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}
}
