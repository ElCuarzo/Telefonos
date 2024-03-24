package com.telefonos.marcas;

public class Galaxy extends Phone implements Ringable{
	private String model = "Galaxy";
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	public String ring() {
		return model + " " + versionNumber + " dice " + ringTone;
	}
	
	public String unlock() {
		return "Desbloqueado con reconocimiento facial";
	}
	
	public void displayInfo() {
		System.out.println(model + " " + versionNumber + " from " + carrier);
	}
}
