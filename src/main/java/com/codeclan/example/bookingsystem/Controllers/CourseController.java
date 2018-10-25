package com.codeclan.example.bookingsystem.Controllers;


import com.codeclan.example.bookingsystem.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.CourseRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesByRating(@PathVariable CourseRating rating) {
        return courseRepository.getAllCoursesWithAGivenRating(rating);

    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> getAllCoursesForCustomer(@PathVariable Long id){
        return courseRepository.getAllCoursesForCustomer(id);
    }
}
