package com.codeclan.example.bookingsystem.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String date;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "customer", nullable = false)
    private Customer customer;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "course", nullable = false)
    private Course course;


    public Booking(String date, Customer customer, Course course) {
        this.date = date;
        this.customer = customer;
        this.course = course;
    }

    public Booking(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
