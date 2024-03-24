package com.telefonos.marcas;

public abstract class Phone {
	    protected String versionNumber;
	    private int batteryPercentage;
	    protected String carrier;
	    protected String ringTone;
	    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
	        this.versionNumber = versionNumber;
	        this.batteryPercentage = batteryPercentage;
	        this.carrier = carrier;
	        this.ringTone = ringTone;
	    }
	    
	    // Método abstracto. Este método será implementado por las subclases
	    
	    public abstract void displayInfo();
	    
	    // getters y setters removidos para resumir. Por favor implementarlos por usted mismo.
	    
	    public void setVersionNumber(String VersionDeNumero) {
	    	this.versionNumber = VersionDeNumero;
	    }
	    
	    public String getVersionNumber() {
	    	return versionNumber;
	    }
	    
	    public void setBatteryPercentage(int BateriaPorcentaje) {
	    	this.batteryPercentage = BateriaPorcentaje;
	    }
	    
	    public int getBatteryPercentage() {
	    	return batteryPercentage;
	    }
	    
	    public void setCarrier(String Carrier) {
	    	this.carrier = Carrier;
	    }
	    
	    public String getCarrier() {
	    	return carrier;
	    }
	    
	    public void setRingTone(String Tono) {
	    	this.ringTone = Tono;
	    }
	    
	    public String getRingTone() {
	    	return ringTone;
	    }
}
