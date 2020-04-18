package org.spring.dao;

import java.util.List;
import org.spring.model.User;
public interface AppDAO {

	public List<User> listUsers();
	
	void addUser(User user);
}
