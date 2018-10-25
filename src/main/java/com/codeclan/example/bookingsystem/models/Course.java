package com.codeclan.example.bookingsystem.models;

public class Course {

    private Long id;
    private String courseName;
    private String location;
    private CourseRating rating;

    public Course(String courseName, String location, CourseRating rating) {
        this.courseName = courseName;
        this.location = location;
        this.rating = rating;
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
}
