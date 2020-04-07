package com.techelevator.community;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;





public class CommunityJdbcDao implements CommunityDao {

	private JdbcTemplate jdbcTemplate;

	public CommunityJdbcDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// To insert a date into a prepared statement, wrap the date in
	// `Date.valueOf()`
	// method: `Date.valueOf(myObject.getCreated())`

	@Override
	public void save(Community savedCommunity) {
		String sqlInsertCommunity = "INSERT INTO communities(id, name, latitude, longitude, created, live) "  // Couldn't Get this to work during assesment because I was ordering the next ID Function wrong. Had Tried both UPDATE and INSERT INTO. 
																											  // Reverted back to where I was at 35 min into coding, went back to INSERT INTO and changed the (seq_communities_id) to (communities_seq_id). Worked Perfectly. Furious at myself.   
									+ "Values (? ,? ,? ,? ,? ,? ) "; 
		savedCommunity.setId(getNextCommunityId());
		jdbcTemplate.update(sqlInsertCommunity, savedCommunity.getId(), savedCommunity.getName(), savedCommunity.getLatitude(), savedCommunity.getLongitude(), Date.valueOf(savedCommunity.getCreated()), savedCommunity.isLive());
	}

	
	@Override
	public List<Community> getAllCommunities() {
		// Implement this method to pull in all communities from database
		List<Community> allCommunities = new ArrayList<Community>();
		String sqlGetAllCommunities = "Select * FROM communities;";
		SqlRowSet communityResults = jdbcTemplate.queryForRowSet(sqlGetAllCommunities);
		while (communityResults.next()) {
			Community theCommunity = mapRowToCommunity(communityResults);
			allCommunities.add(theCommunity);
		}
		return allCommunities;
	}


	private Community mapRowToCommunity(SqlRowSet results) {
		Community communityRow = new Community();
		communityRow.setId(results.getLong("id"));
		communityRow.setName(results.getString("name"));
		communityRow.setLatitude(results.getBigDecimal("latitude"));
		communityRow.setLongitude(results.getBigDecimal("longitude"));
		communityRow.setCreated(results.getDate("created").toLocalDate());
		communityRow.setLive(results.getBoolean("live"));
		return communityRow;
	}

	private Long getNextCommunityId() {
		SqlRowSet nextIdResult= jdbcTemplate.queryForRowSet("SELECT nextval('communities_id_seq')");
		if (nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an Id for the community");
		}
}


}

