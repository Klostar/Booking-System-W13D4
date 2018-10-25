package com.codeclan.example.bookingsystem.Repositories.BookingRepository;

import com.codeclan.example.bookingsystem.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

     List<Booking> getAllBookingsForDate(String date);

    }
