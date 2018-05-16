package com.java9s.designpattern.factory;

public class Huawei implements Telefono{
	private int ramSize;
	private String processor;
	public String name = Telefono.HUAWEI;
	public Huawei(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Huawei(String processor){
		this.processor = processor;
		this.ramSize =3;
	}
	
}
