package com.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;
import com.dao.UserDao;

@RestController
 public class UserController {
	@GetMapping("/users")
	public ArrayList<UserBean> getAllUsers()
	{
		return UserDao.users;
	}	
	
	@PostMapping("/user")
	public UserBean insertUser(UserBean user)
	{
		UserDao.users.add(user);
		return user;
	}
	
	@GetMapping("/user/{userId}")
	public UserBean getUserById(@PathVariable("userId") int userId)
	{
		for(int i=0;i<UserDao.users.size();i++)
		{
			if(UserDao.users.get(i).getUserId()==userId)
			{
				return UserDao.users.get(i);
			}
		}
		return null;
	}
	
	@DeleteMapping("/user/{userId}")
	public UserBean deleteUserById(@PathVariable("userId") int userId)
	{
		UserBean u=null;
		for (UserBean x : UserDao.users) {
			if(x.getUserId()==userId)
			{
				u=x;
				break;
			}
		}
		UserDao.users.remove(u);
		return u;
	}
	
	@PutMapping("/user")
	public UserBean updateUser(UserBean user)
	{
		for(int i=0;i<UserDao.users.size();i++)
		{
			if(UserDao.users.get(i).getUserId()==user.getUserId())
			{
				UserDao.users.get(i).setFirstName(user.getFirstName());
//				UserDao.users.get(i).setEmail(user.getEmail());
//				UserDao.users.get(i).setPassword(user.getPassword());
			}
		}
		return user;
	}
}
