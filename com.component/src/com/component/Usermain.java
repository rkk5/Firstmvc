package com.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Usermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
     User user = con.getBean("user",User.class);
     System.out.println(user.getUsername());
     System.out.println(user.getUserid());
     
	}

}
