package com.oracle.service;

import java.util.List;

import com.oracle.beans.User;

public interface UserService {

	User store(User user);

	List<User> findAll();

}