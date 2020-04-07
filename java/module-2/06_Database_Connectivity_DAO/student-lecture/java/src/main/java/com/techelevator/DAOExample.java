package com.techelevator;

import java.awt.List;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

public class DAOExample {

	public static void main(String[] args) {
		
// the application program is defining the datasource 
		
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
	
		
//	The application program instantiates the DAO it wants to use passing it the datasource it created
		
		CityDAO dao = new JDBCCityDAO(worldDataSource);
		
		City smallville = new City();		// instantiate a new City object
		smallville.setCountryCode("USA");	// populate the non-serial fields
		smallville.setDistrict("KS");		// 		using the set
		smallville.setName("Smallville");	// 			methods for 
		smallville.setPopulation(42080);	// 				the class
		
// We have a City object with all values filled in except the serial value(s) - primary key
// 		The primary key will be assigned by the save() method in the DAO 
		
		dao.save(smallville);    // Use the DAO save method to save my object in the database
		
		City theCity = dao.findCityById(smallville.getId());  // use dao to find  me a city
			
// List the Cities in the USA
		
		// List<City> theCities = dao.findCityByCountryCode("USA"); - Other option
		// for (City aCity : theCities)
		// System.out.println("a City in USA: " + "City ID:" + aCity.getId() + "City Name: "+ aCity.getName());
		
		
		for (City aCity : dao.findCityByCountryCode("USA")) {
			System.out.println("a City in USA: " + "City ID:" + aCity.getId() + "City Name: "+ aCity.getName());
		}
// Change the population of Smallville
		smallville.setPopulation(2);
		dao.update(smallville);
		
		theCity = dao.findCityById(smallville.getId());
		System.out.println("City ID:" + theCity.getId() + " City Name: "+ theCity.getName() + " Population: " + theCity.getPopulation());
		
	}

}
