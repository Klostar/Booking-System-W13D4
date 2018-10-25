package com.codeclan.example.bookingsystem.Repositories.CourseRepository;

import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.CourseRating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    public List<Course> getAllCoursesWithAGivenRating(CourseRating rating);

    public List<Course> getAllCoursesForCustomer(Long customerId);
}
