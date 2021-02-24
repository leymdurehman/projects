package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.addressbook.Contact;
import com.techelevator.addressbook.ContactDao;
import com.techelevator.addressbook.JdbcContactDao;

public class AddressBookApp {

	public static void main(String[] args) {
	
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/addressbook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		ContactDao contactdao = new JdbcContactDao(dataSource);
		
		
		java.util.List<Contact> contacts = contactdao.list();
		
		
		for (Contact contact : contacts) {
			
			System.out.println(contacts);
		}
		
		
	}

}
