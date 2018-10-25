package com.codeclan.example.bookingsystem.Components;

import com.codeclan.example.bookingsystem.Repositories.BookingRepository.BookingRepository;

import com.codeclan.example.bookingsystem.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingsystem.Repositories.CustomerRepository.CustomerRepository;
import com.codeclan.example.bookingsystem.models.Booking;
import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.CourseRating;
import com.codeclan.example.bookingsystem.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader extends ApplicationRunner {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer customer1 = new Customer("Bob", "Stirling", 28);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Sally", "Edinburgh", 29);
        customerRepository.save(customer2);

        Course course1 = new Course("Ruby", "Edinburgh", CourseRating.THREE);
        courseRepository.save(course1);
        Course course2 = new Course ("Java", "Edinburgh", CourseRating.FOUR );
        courseRepository.save(course2);

        Booking booking1 = new Booking("03-03-18", customer1, course1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("03-03-18", customer2, course2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("03-03-18", customer2, course1);
        bookingRepository.save(booking3);

    }
}
