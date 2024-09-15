package com.praveen.service;

import java.util.List;

import com.praveen.model.User;

public interface UserService {

	public User saveUser(User user);

	public List<User> getAllUser();

	public User updateUser(User user);

	public void deleteUser(Integer userId);

	public User getUserById(Integer userId);

}