package com.codeclan.example.bookingsystem;

import com.codeclan.example.bookingsystem.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.CourseRating;
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

	@Test
	public void contextLoads() {
	}


	@Test
	public void getAllCoursesWithAGivenRating(){
		List<Course> results = courseRepository.getAllCoursesWithAGivenRating(CourseRating.FOUR);
	}
}
