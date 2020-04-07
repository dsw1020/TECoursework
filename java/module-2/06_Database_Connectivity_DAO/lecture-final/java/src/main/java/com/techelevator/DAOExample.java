package com.techelevator;

import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

public class DAOExample {

	public static void main(String[] args) {

// The application program defines the datasource
		
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");

//	The application program instantiates the DAO it wants to use passing it the datasource it created	
		CityDAO dao = new JDBCCityDAO(worldDataSource);
		
		City smallville = new City();      // instantiate a new City object
		smallville.setCountryCode("USA");  // populate the non-serial fields
		smallville.setDistrict("KS");      //     using the set 
		smallville.setName("Smallville");  //        methods for
		smallville.setPopulation(42080);   //             the class

// We have a City object with all values filled in except the serial value(s) - primary
//   The primary key will be assigned by save() method in the DAO
		
		dao.save(smallville);    // Use the DAO save method to save my object in the database
		
		City theCity = dao.findCityById(smallville.getId());  // use dao to find  me a city
		
		System.out.println("City ID: " + theCity.getId() + " Çity Name: " + theCity.getName());
		
// List the Cities in the USA	
		
		for (City aCity : dao.findCityByCountryCode("USA")) {
			System.out.println("a City in USA: " + "City ID: " + aCity.getId() + " Çity Name: " + aCity.getName());
		
	}
// Change the population of Smallville
		
		smallville.setPopulation(2);
		
		dao.update(smallville);
		
        theCity = dao.findCityById(smallville.getId());  // use dao to find  me a city
		
		System.out.println("City ID: " + theCity.getId() + " Çity Name: " 
		                               + theCity.getName() + "population: " + theCity.getPopulation());
	}
}
