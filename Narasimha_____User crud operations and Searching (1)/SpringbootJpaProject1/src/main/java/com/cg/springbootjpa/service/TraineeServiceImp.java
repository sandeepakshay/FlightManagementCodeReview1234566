package com.cg.springbootjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springbootjpa.dao.TraineeDao;
import com.cg.springbootjpa.model.Trainee;
@Transactional
@Service
public class TraineeServiceImp implements TraineeService{
	
	@Autowired
	TraineeDao traineedao;
	
	@Override
	public void create(Trainee trianee) {
		boolean b=traineedao.create(trianee);
		if(b==true)
		{
			System.out.println("Added SucessFully");
		}
		else
		{
			System.out.println("Not Added");
		}
		
	}

	@Override
	public List<Trainee> reterive() {
		List<Trainee> list=traineedao.reterive();
		return list;
	}

	@Override
	public Trainee findById(int id) {
		Trainee tr=traineedao.findById(id);
		return tr;
	}

	@Override
	public Boolean delete(int id) {
		traineedao.delete(id);
		return null;
		
	}

	@Override
	public void update(int id,String name,String domain,String location) {
		traineedao.update(id,name,domain,location);
		
	}

}
