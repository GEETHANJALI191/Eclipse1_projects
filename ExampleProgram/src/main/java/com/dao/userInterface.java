package com.dao;

import java.util.List;

import com.pojo.UserPojo;

public interface userInterface {
	public String addUser(UserPojo user);
	public void deleteUser(int userid);
	 public void updateUser(UserPojo user);
	 public List<UserPojo> getAllUsers();
	 public UserPojo getUserById(int id);
	 public UserPojo RetrieveDetails(int id);

}
