package com.cg.springbootjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.springbootjpa.exception.UserTypeException;
import com.cg.springbootjpa.model.Trainee;
import com.cg.springbootjpa.model.Users;
@Transactional
@Repository
public class UserDaoImp implements UserDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addUserDao(Users user) {
		entityManager.persist(user);
		
	}

	@Override
	public List<Users> viewUsersDao() {
		String Qstr="SELECT user from Users user";
		TypedQuery<Users> query=entityManager.createQuery(Qstr,Users.class);
		return query.getResultList();
	
	}

	@Override
	public Users viewByIdDao(int id) {
		return entityManager.find(Users.class, id);
		
	}

	@Override
	public void deletebyIdDao(int id) {
		Users user=entityManager.find(Users.class, id);
		entityManager.remove(user);
		
	}

	@Override
	public void updateDao(int userId,Users user) {
		Users user1=entityManager.find(Users.class, userId);
		if(user1==null)
		{
			throw new UserTypeException("User doesnot Exixts");
		}
		user1.setUserName(user.getUserName());
		user1.setPassword(user.getPassword());
		user1.setEmail(user.getEmail());
		user1.setPhone(user.getPhone());
		entityManager.persist(user1);
		
	}



}
