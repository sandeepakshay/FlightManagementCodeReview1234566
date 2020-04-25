package com.cg.springbootjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.springbootjpa.model.Trainee;
@Transactional
@Repository
public class TraineeImp implements TraineeDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Trainee trianee) {
		
			em.persist(trianee);
			return true;

	}

	@Override
	public List<Trainee> reterive() {
		String Qstr="SELECT trainee from Trainee trainee";
		TypedQuery<Trainee> query=em.createQuery(Qstr,Trainee.class);
		return query.getResultList();
	}

	@Override
	public Trainee findById(int id) {
		return em.find(Trainee.class, id);
		
	}

	@Override
	public void delete(int id) {
		Trainee tr=em.find(Trainee.class, id);
		em.remove(tr);
		
	}

	@Override
	public void update(int id,String name,String domain,String location) {
		Trainee tr=em.find(Trainee.class, id);
		tr.setTraineeName(name);
		tr.setTraineeDomain(domain);
		tr.setTraineeLocation(location);
		
	}

}
