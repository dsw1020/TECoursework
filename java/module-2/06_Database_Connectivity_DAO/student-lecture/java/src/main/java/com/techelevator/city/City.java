package com.techelevator.city;

public class City {
	
// one instance variable for every column
	
	private Long id;		 // defined as long because its a serial, but can also be an int , depends on the size of the number
	private String name;
	private String countryCode;
	private String district;
	private int population;

	
// standard getter/setters  getVariableName / setVariableName
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
