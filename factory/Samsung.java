package com.java9s.designpattern.factory;

public class Samsung implements Telefono{
	private int ramSize;
	private String processor;
        
	public Samsung(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Samsung(String processor){
		this.processor = processor;
		this.ramSize =2;
	}
	
}
