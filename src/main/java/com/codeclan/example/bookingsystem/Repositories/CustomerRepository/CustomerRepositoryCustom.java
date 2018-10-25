package com.codeclan.example.bookingsystem.Repositories.CustomerRepository;

import com.codeclan.example.bookingsystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
   List<Customer> getCustomersOnCourse(Long courseId);

    List<Customer> getCustomersInGivenTownForGivenCourse(String town, Long courseId);


}
