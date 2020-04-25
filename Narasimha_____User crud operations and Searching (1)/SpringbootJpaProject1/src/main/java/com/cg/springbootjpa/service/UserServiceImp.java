package com.cg.springbootjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springbootjpa.dao.UserDao;
import com.cg.springbootjpa.model.Trainee;
import com.cg.springbootjpa.model.Users;
@Transactional
@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	UserDao userDao;
	

	@Override
	public void addUserService(Users user) {
		userDao.addUserDao(user);
		
	}

	@Override
	public List<Users> viewUserService() {
		List<Users> list=userDao.viewUsersDao();
		return list;
	}

	@Override
	public Users viewByIdService(int id) {
		Users user=userDao.viewByIdDao(id);
		return user;

	}

	@Override
	public Boolean deletebyIdService(int id) {
		userDao.deletebyIdDao(id);
		return null;
		
	}

	@Override
	public void updateService(int userId,Users user) {
		userDao.updateDao(userId, user);
	}

}
