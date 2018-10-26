package org.mongo.dal;

import java.util.List;

import org.models.User;
public interface UserDAL {
	
	List<User> getAllUser();
	
	User getUserById(String userId);
	
	User addNewUser(User user);
	
	Object getAllUserSettings(String userId);
	
	String getUserSetting(String userId, String key);
	
	String addUserSetting(String userId, String key, String value);
}
