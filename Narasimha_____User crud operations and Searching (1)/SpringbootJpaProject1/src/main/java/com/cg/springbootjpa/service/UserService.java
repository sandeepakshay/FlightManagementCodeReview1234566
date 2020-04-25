package com.cg.springbootjpa.service;

import java.util.List;

import com.cg.springbootjpa.model.Users;

public interface UserService {
	
	public void addUserService(Users user);
	public List<Users> viewUserService();
	public Users viewByIdService(int id);

	public Boolean deletebyIdService(int id);

	public void updateService(int userId,Users user);


}
