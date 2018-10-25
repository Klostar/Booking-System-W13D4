package com.codeclan.example.bookingsystem.Repositories.CustomerRepository;


import com.codeclan.example.bookingsystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {


    @Autowired
    EntityManager entityManager;



    //TODO get all customers for a given course


    @Transactional
    public List<Customer> getCustomersOnCourse(Long courseId){
         List<Customer>results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);

        cr.createAlias("bookings" , "booking");

        cr.add(Restrictions.eq("booking.course.id", courseId ));
        results = cr.list();
        return results;
    }


    //TODO get all customers for a given town and course

    //TODO get all customers over a certain age given town and course
}
