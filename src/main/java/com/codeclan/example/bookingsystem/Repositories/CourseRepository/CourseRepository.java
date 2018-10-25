package com.codeclan.example.bookingsystem.Repositories.CourseRepository;

import com.codeclan.example.bookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
