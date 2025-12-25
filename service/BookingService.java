package service;

import exception.*;
import model.*;
import utility.IdGeneration;

import java.util.*;

public class BookingService
 {

    private Map<String, List<Seat>> bookings = new HashMap<>();// by using ht ehasMap of the system are as :
    private SeatService seatService;

    public BookingService(SeatService seatService) {
        this.seatService = seatService;
    }

    public String bookSeats(List<String> seatIds)
            throws InvalidSeatException, SeatAlreadyBookedException
            // bys using the excve[tuion handling ofubyusing throws 
        {

        List<Seat> bookedSeats = new ArrayList<>();// by applying the array alsit are :

        double totalPrice = 0;// aviding the wild pointer the storga e value ot the 

        for (String id : seatIds) {
            Seat seat = seatService.getSeat(id);
            if (seat.getStatus() == SeatStatus.BOOKED) 
                {

                throw new SeatAlreadyBookedException(" No seats Vacanncy: " + id);// if the exception is thrown then this state will be worked and run of if statement
            }
            bookedSeats.add(seat);
            totalPrice =totalPrice + seat.getPrice();
        }

        bookedSeats.forEach(Seat::book);
        String bookingId = IdGeneration.generateBookingId();
        bookings.put(bookingId, bookedSeats);

        System.out.println("Booking Successful * Total Price: $" + totalPrice);
        return bookingId;
    }

    public void cancelBooking(String bookingId) throws BookingNotFoundException {
        if (!bookings.containsKey(bookingId)) {
            throw new BookingNotFoundException("Booking not found: " + bookingId);
        }

        bookings.get(bookingId).forEach(Seat::cancel);
        bookings.remove(bookingId);

        System.out.println("Booking Cancelled Successfully");
    }

    public void viewBookingDetails(String bookingId) throws BookingNotFoundException {
        if (!bookings.containsKey(bookingId)) {
            throw new BookingNotFoundException("Booking not found");
        }
        bookings.get(bookingId).forEach(System.out::println);
    }
}

