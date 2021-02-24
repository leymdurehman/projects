package com.techelevator.addressbook;

import java.util.List;

public interface ContactDao {

// this is our crud
	List <Contact> list();
	Contact get(int contactId);
	void save(Contact contact);
	void update(Contact contact);
	void delete(int contactId);
	
	
}
