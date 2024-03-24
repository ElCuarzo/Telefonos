package com.telefonos.marcas;

public class iPhone extends Phone implements Ringable{
	private String model = "IPhone";
	public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	public String ring() {
		return model + " " + versionNumber + " dice " + ringTone;
	}
	
	public String unlock() {
		return "Desbloqueado via huella digital";
	}
	
	public void displayInfo() {
		System.out.println(model + " " + versionNumber + " from " + carrier);
	}
}
