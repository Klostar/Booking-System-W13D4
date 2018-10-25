package com.codeclan.example.bookingsystem.Repositories.BookingRepository;

import com.codeclan.example.bookingsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    public List<Booking> getAllBookingsForDate(String date);

    }
