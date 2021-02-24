package com.techelevator.addressbook;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcContactDao implements ContactDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcContactDao(DataSource datasource) {
		
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	
	@Override
	public List<Contact> list() {
		String sql = "SELECT contact_id, first_name, last_name FROM contact";

		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql);
		
		List<Contact> contacts = new ArrayList<Contact>();
		while (rows.next()){
			contacts.add(mapRowToContact(rows));
			
			
			
			
			
		}
		
		
		
		
		
return null;
	}

	@Override
	public Contact get(int contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int contactId) {
		// TODO Auto-generated method stub
		
	}


	private Contact mapRowToContact(SqlRowSet row) {
		Contact contact = new Contact();
		contact.setContactId(row.getInt("contact_id"));
		contact.setFirstName(row.getString("first_name"));
		contact.setLastName(row.getString("last_name"));
		
		return contact;
		
		
	}





}
