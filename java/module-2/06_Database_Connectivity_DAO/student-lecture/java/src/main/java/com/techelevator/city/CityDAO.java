package com.techelevator.city;

import java.util.List;

public interface CityDAO {   // interface names tablenameDAO

	public void save(City newCity);         // save the to the database when given a completed object

	// Search methods
	public City findCityById(long id);      // search by primary key
	public List<City> findCityByCountryCode(String countryCode); // search by other common values
	public List<City> findCityByDistrict(String district);

	public void update(City city);         // update a entry in the data base given a object
	public void delete(long id);           // delete by primary key
	
	public List<City> allCities();         // return all rows from the table
}
