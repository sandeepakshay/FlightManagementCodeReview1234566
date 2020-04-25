package com.cg.springbootjpa.dao;

import java.util.List;

import com.cg.springbootjpa.model.Trainee;
import com.cg.springbootjpa.model.Users;

public interface UserDao {
	
	public void addUserDao(Users user);

	public List<Users> viewUsersDao();
	
	public Users viewByIdDao(int id);

	public void deletebyIdDao(int id);

	public void updateDao(int userId,Users user);
	
	//public Users login(String userName, String password, int id);

	

}
