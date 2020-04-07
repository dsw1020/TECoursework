package com.techelevator.dao;

import com.techelevator.dao.model.Customer;
import com.techelevator.dao.model.Film;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
		List<Customer> theCustomerSearched = new ArrayList<>();
		
		String customerSearchSql = "SELECT first_name, last_name FROM actor "
								 + "WHERE last_name = ? ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(search, sort);
        while (results.next()) {
        	theCustomerSearched.add(mapRowToCustomer(results));
        }
		return theCustomerSearched;
	}

	
	
	private Customer mapRowToCustomer(SqlRowSet results) {
        Customer customerRow = new Customer();
        customerRow.setFirstName(results.getString("firstName"));
        customerRow.setLastName(results.getString("lastName"));
        customerRow.setEmail(results.getString("email"));
        customerRow.setActive(results.getBoolean("active"));
        
        return customerRow;
    }
	
	
	
	
}