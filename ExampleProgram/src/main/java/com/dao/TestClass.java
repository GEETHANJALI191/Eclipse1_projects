package com.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pojo.UserPojo;

public class TestClass {
@Test
public void InsertTest(){
	userInterfaceImplClass ip=new userInterfaceImplClass();
	UserPojo user=new UserPojo();
	assertEquals("true",ip.addUser(user));	
}
@Test
public void RetriveTest(){
	userInterfaceImplClass i=new userInterfaceImplClass();
	UserPojo user=new UserPojo();
	user.setId(10);
	user.setFirstname("geetha");
	user.setLastname("bm");
	assertEquals(user,i.RetrieveDetails(10));
	
}
}
