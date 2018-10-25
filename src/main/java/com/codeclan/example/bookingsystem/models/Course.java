package com.codeclan.example.bookingsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private Long id;
    private String courseName;
    private String location;
    private CourseRating rating;
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
