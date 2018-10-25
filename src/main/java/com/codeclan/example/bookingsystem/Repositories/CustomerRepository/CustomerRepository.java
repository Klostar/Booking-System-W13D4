package com.codeclan.example.bookingsystem.Repositories.CustomerRepository;

import com.codeclan.example.bookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer , Long>, CustomerRepositoryCustom {

 List<Customer> getCustomersOnCourse(Long courseId);
 List<Customer> getCustomersInGivenTownForGivenCourse(String town, Long courseId);
}
