package com.java9s.designpattern.factory;

public class Main {
	 public static void main(String[] args) {
                Telefono telLG = TelFactory.createMobile(Telefono.LG);
                Telefono telSony = TelFactory.createMobile(Telefono.SONY);
	}
}
