package com.java9s.designpattern.factory;

public class Sony implements Telefono{
	private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}
}
