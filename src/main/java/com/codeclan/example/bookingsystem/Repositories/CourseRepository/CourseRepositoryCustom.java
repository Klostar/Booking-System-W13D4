package com.codeclan.example.bookingsystem.Repositories.CourseRepository;

import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.CourseRating;

import java.util.List;

public interface CourseRepositoryCustom {

    public List<Course> getAllCoursesWithAGivenRating(CourseRating rating);

    public List<Course> getAllCoursesForCustomer(Long customerId);

}
