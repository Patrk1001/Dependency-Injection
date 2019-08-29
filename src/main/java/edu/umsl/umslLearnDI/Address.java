package edu.umsl.umslLearnDI;

public class Address {
	
	private int houseNumber;
	private String streetName;
	private int zip;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(int houseNumber, String streetName, int zip) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.zip = zip;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + ", zip=" + zip + "]";
	}
	

}
