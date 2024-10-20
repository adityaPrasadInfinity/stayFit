package com.vector.stayfit.service.booking;

import com.vector.stayfit.entity.Booking;
import com.vector.stayfit.exception.BookingAlreadyPresentException;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BookingServiceImpl implements BookingService {

  List<Booking> bookingList;

  @PostConstruct
  void init() {
    this.bookingList = new ArrayList<>();
  }

  @Override
  public List<Booking> allBookingByUserId(Long userId) {
    return bookingList.stream().filter(e -> e.getUserId().equals(userId)).toList();
  }

  @Override
  public Booking addBooking(Booking booking) {
    List<Booking> temp = bookingList.stream().filter(
            e -> e.getUserId().equals(booking.getUserId()) && e.getSlotId().equals(booking.getSlotId()))
        .toList();

    if(!temp.isEmpty()){
      throw new BookingAlreadyPresentException("booking already present");
    }

    booking.setId(Long.valueOf(bookingList.size()));
    bookingList.add(booking);
    return booking;
  }
}
