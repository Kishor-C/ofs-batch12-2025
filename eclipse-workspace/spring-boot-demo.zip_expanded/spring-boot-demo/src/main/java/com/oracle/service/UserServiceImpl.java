package com.oracle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.beans.User;

@Service // spring framework creates object of this class in its container
public class UserServiceImpl implements UserService {
	/*
	 * Think this class will maintain the data in List<User> without Dao
	 */
	private static List<User> usersList = new ArrayList<>();
	
	@Override
	public User store(User user) {
		usersList.add(user);
		return user;
	}
	@Override
	public List<User> findAll() {
		return usersList;
	}
}
