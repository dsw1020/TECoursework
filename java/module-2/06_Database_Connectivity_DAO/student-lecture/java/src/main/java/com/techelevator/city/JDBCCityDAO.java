package com.techelevator.city;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

// implement the methods for DAO - all interface methods must be implements
// additional outside the interface may be added

public class JDBCCityDAO implements CityDAO {  // concrete class is named JDBCtablenameDAO

	private JdbcTemplate myJdbcTemplate;  // declare an JdbcTemplate variable
	
	// constructor that takes datasource and assigns to JdbcTemplate object
	
	public JDBCCityDAO(DataSource aDataSource) {
		this.myJdbcTemplate = new JdbcTemplate(aDataSource);  // instantiate and initialize JdbcTemplate with datasource
	}

	@Override
	public void save(City newCity) {  // add a new city from a City object
		String sqlInsertCity = "INSERT INTO city(id, name, countrycode, district, population) " +
							   "VALUES(?, ?, ?, ?, ?)";  // ? - placeholders for the different values
		newCity.setId(getNextCityId());								// Get the next value for the primary key and and set in object
		myJdbcTemplate.update(sqlInsertCity, newCity.getId(),			// Use the 
										     newCity.getName(),			// 		object's
										     newCity.getCountryCode(),  //			get methods
										     newCity.getDistrict(),		//				to get the
										     newCity.getPopulation());	//					values for the insert
	}
	
	@Override
	public City findCityById(long id) {
		
		City theCity = null;    // Default object returned if a non-exiting city is requested
		
		String sqlFindCityById = "SELECT id, name, countrycode, district, population "+
							   "FROM city "+
							   "WHERE id = ?";
		SqlRowSet results = myJdbcTemplate.queryForRowSet(sqlFindCityById, id);  // Run the SELECT using the id Passed in for the CITY ID
		if(results.next()) {                // if a City was found
			theCity = mapRowToCity(results);//    Set the City to the values retrieved and return it
			                                //    Map mapRowToCity will create a City object and populate 
			                                //        with values from the table
		}
		return theCity;                     // if not found, return the null City object we defined at the start of method
	}

	@Override
	public List<City> findCityByCountryCode(String countryCode) {
		ArrayList<City> cities = new ArrayList<>();  // Returned from method
		
		String sqlFindCityByCountryCode = "SELECT id, name, countrycode, district, population "+
										   "FROM city "+
										   "WHERE countrycode = ?";
		SqlRowSet results = myJdbcTemplate.queryForRowSet(sqlFindCityByCountryCode, countryCode);

		while(results.next()) {
			City theCity = mapRowToCity(results);  // instantiate a new City object and map a row to it
			cities.add(theCity);				   // add the new City object to the ArrayList
		}
		return cities;
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(City passedCity) {
		
		String anSqlStatement = "update city " + 
									" Set name 			= ? " +
									"   , countrycode 	= ? " +
									"   , district 		= ? " +
									"   , population 	= ? " +
									"where id = ?";
		myJdbcTemplate.update(anSqlStatement, 
								passedCity.getName()
								,passedCity.getCountryCode()
								,passedCity.getDistrict()
								,passedCity.getPopulation()
								,passedCity.getId());

		
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	private long getNextCityId() {
		SqlRowSet nextIdResult = myJdbcTemplate.queryForRowSet("SELECT nextval('seq_city_id')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new city");
		}
	}

	private City mapRowToCity(SqlRowSet results) {   // Copy all the values from result into a new City object return it
		                                             // This method expects results to include all columns in the table
		                                             // Be sure all data expected method is in the result from SQL
		City theCity;          // define object to return
		theCity = new City();  // instantiate and initialize object to default values
		
		theCity.setId(results.getLong("id"));                     // copy id from the reuslt to id in object
		theCity.setName(results.getString("name"));               // copy name from the reuslt to name in object
		theCity.setCountryCode(results.getString("countrycode")); // copy countrycode from the reuslt to countrycode in object
		theCity.setDistrict(results.getString("district"));       // copy district from the reuslt to district in object
		theCity.setPopulation(results.getInt("population"));      // copy population from the reuslt to population in object

  		return theCity;       // return the object with the data from the SQL results
	}

	@Override
	public List<City> allCities() {
		// TODO Auto-generated method stub
		return null;
	}

	}

