package com.codeclan.example.bookingsystem.Repositories.BookingRepository;

import com.codeclan.example.bookingsystem.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom{

    //TODO get all bookings for a given date

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> getAllBookingsForDate(String date){
        List<Booking> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Booking.class);
        cr.add(Restrictions.eq("date" , date));
        results = cr.list();
        return results;

    }
}
