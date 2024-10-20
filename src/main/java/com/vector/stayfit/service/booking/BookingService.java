package com.vector.stayfit.service.booking;

import com.vector.stayfit.entity.Booking;
import java.util.List;

public interface BookingService {

  List<Booking> allBookingByUserId(Long userId);

  Booking addBooking (Booking booking);
}
