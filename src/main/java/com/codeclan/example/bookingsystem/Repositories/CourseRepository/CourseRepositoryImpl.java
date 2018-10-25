package com.codeclan.example.bookingsystem.Repositories.CourseRepository;

import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.CourseRating;
import com.codeclan.example.bookingsystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;


    //TODO get all courses with a given rating

    @Transactional
    public List<Course> getAllCoursesWithAGivenRating(CourseRating rating)
    {
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Course.class);
        cr.add(Restrictions.eq("rating", rating));
        results =cr.list();
        return results;

    }

    //TODO: get all coursese for a given customer

    @Transactional
    public List<Course> getAllCoursesForCustomer(Long customerId){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Course.class);
        cr.createAlias("bookings", "booking");
        cr.add(Restrictions.eq("booking.customer.id", customerId));
        results =cr.list();
        return results;
    }


}
