package com.java9s.designpattern.factory;

public class LG implements Telefono{
	private int ramSize;
	private String processor;
	public String name = Telefono.LG;
	public LG(int ramSize){
		this.ramSize = ramSize;
	}
	
	public LG(String processor){
		this.processor = processor;
		this.ramSize =2;
	}
	
}
