package com.codeclan.example.bookingsystem;

import com.codeclan.example.bookingsystem.Repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookingsystem.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingsystem.Repositories.CustomerRepository.CustomerRepository;
import com.codeclan.example.bookingsystem.models.Booking;
import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.CourseRating;
import com.codeclan.example.bookingsystem.models.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingsystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void getAllCoursesWithAGivenRating(){
		List<Course> results = courseRepository.getAllCoursesWithAGivenRating(CourseRating.FOUR);
	}

	@Test
	public void getCustomersOnCourse(){
		List<Customer> results = customerRepository.getCustomersOnCourse(1L);
	}

	@Test
	public void getAllBookingsForDate(){
		 List<Booking> results = bookingRepository.getAllBookingsForDate("03-03-18");

		}


		@Test
		public void getAllCoursesForCustomer(){
		List<Course> results = courseRepository.getAllCoursesForCustomer(1L);
		}

	}
