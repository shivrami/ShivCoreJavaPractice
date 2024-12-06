package com.corejava.question.question5;

public abstract class Airplane 
{
	protected int passengerCapacity;
	protected String serialNumber;
	
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {						
		return "Airplane [Type = "+this.getClass().getSimpleName()+", passengerCapacity=" + passengerCapacity + ", serialNumber=" + serialNumber + "]";
	}	
}
