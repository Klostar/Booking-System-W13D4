package com.codeclan.example.bookingsystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "courses")
public class Course {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseName;
    @Column(name = "location")
    private String location;

    @Column(name = "rating")
    private CourseRating rating;

    @JsonIgnore
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Course(String courseName, String location, CourseRating rating) {
        this.courseName = courseName;
        this.location = location;
        this.rating = rating;
        this.bookings = new ArrayList<>();
    }

    public Course(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CourseRating getRating() {
        return rating;
    }

    public void setRating(CourseRating rating) {
        this.rating = rating;
    }

    public int getRatingValue(){
        return this.rating.getRating();
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
