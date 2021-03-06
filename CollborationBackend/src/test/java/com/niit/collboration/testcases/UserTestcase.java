/*package com.niit.collboration.testcases;



import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.dao.UserDAO;
import com.niit.collaboration.model.User;



public class UserTestcase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static User user;

	@Autowired
	static UserDAO userDAO;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
		System.out.println("User object is created");
	}
	

	 @Test
	 public void createNewUser(){
		 user.setId("5");
			user.setName("vivan");
			user.setMail("vivan@gmail.com");
			user.setContact("9993232888");
			user.setStatus("N");
			user.setRole("S");
			user.setRemark("student");
			user.setIs_online("N");
			user.setPassword("vivan");
			boolean status = userDAO.save(user);
			Assert.assertEquals("Create user Test Case", true, status);

	 }
	 


	@Test
	public void getUser() {
		User user = userDAO.get("2");
		System.out.println("User ID : " + user.getId() + " user name : " + user.getName() + "\nEmail ID : "
				+ user.getMail() + " Password : " + user.getPassword() + "\n" + "Mobile Number : "
				+ user.getContact());
	}
	
	@Test
	public void updateUserTest(){
		User user = new User();
		user.setId("4");
		user.setName("arnav");
		user.setMail("arnav@gmail.com");
		user.setContact("9993233888");
		user.setStatus("N");
		user.setRole("S");
		user.setRemark("student");
		user.setIs_online("N");
		user.setPassword("arnav");
		boolean result = userDAO.update(user);
		System.out.println("Update Reuslt : "+result);
	}
	}
	*/