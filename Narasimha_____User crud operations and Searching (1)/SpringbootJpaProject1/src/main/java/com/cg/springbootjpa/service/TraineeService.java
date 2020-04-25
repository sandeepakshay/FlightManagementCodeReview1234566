package com.cg.springbootjpa.service;

import java.util.List;

import com.cg.springbootjpa.model.Trainee;

public interface TraineeService {
	public void create(Trainee trianee);

	public List<Trainee> reterive();

	public Trainee findById(int id);

	public Boolean delete(int id);

	public void update(int id,String name,String domain,String location);

}
