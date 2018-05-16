package com.java9s.designpattern.factory;

public class TelFactory {
	public static Telefono createMobile(String type){
		if(type.equals(Telefono.IPHONE)){
			return new iPhone(2, "A9", "A9 GPu");
		}
                else if(type.equals(Telefono.SONY)){
			return new Sony(2,"ARM");
		}
                else if(type.equals(Telefono.SAMSUNG)){
			return new Samsung("Intel");
                }
                else if(type.equals(Telefono.HUAWEI)){
			return new Sony(2,"ARM");
		}
                else if(type.equals(Telefono.LG)){
			return new Samsung("Intel");
                }
                else if(type.equals(Telefono.NOKIA)){
			return new Sony(2,"ARM");
		}else{
			return null;
		}
	}
}
