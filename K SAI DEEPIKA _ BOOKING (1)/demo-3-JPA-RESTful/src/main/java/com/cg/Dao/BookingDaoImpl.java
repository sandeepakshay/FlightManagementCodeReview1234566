package com.cg.Dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.cg.entity.Booking;
import com.cg.exception.BookingException;



@Repository
public class BookingDaoImpl implements BookingDao{
////
	@PersistenceContext
	EntityManager em;

	
	
	
	@Override
	public void addBooking(Booking bookingList) {
		// TODO Auto-generated method stub
		em.persist(bookingList);
		
	}


	
	
	@Override
	public List<Booking> viewBooking() {
	// TODO Auto-generated method stub
		String Qstr = "SELECT booking FROM Booking booking";
		TypedQuery<Booking> query = em.createQuery(Qstr, Booking.class);
		return query.getResultList();
}



	@Override
	public boolean cancelBooking(int bookingId) {
		// TODO Auto-generated method stub
		Booking cancelbooking = em.find(Booking.class, bookingId);
		if(cancelbooking!=null)
			{
			em.remove(cancelbooking);
			return true;
			}
		return false;
	}
}


