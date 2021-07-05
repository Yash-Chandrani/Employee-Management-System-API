package com.dao;
import java.util.ArrayList;
import com.bean.*;

public class UserDao {
	public static ArrayList<UserBean> users=new ArrayList<>();
	static
	{
		UserBean u1=new UserBean();
		u1.setFirstName("Roy");
		u1.setEmail("roy@gmail.com");
		u1.setPassword("1234");
		users.add(u1);
		
		UserBean u2=new UserBean();
		u2.setFirstName("Raj");
		u2.setEmail("raj@gmail.com");
		u2.setPassword("12345");
		users.add(u2);
	}
}
