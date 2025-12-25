package main;
import java.util.*;
import service.*;



public class Main 
{
    public static void main(String[] args)
     {

        SeatService s1 = new SeatService();// object creation of SeatService 

        BookingService b1= new BookingService(s1);// SeatService is mainframed inside the BookingService class

        // By apply ing the try acatch of the exception Handling in the space of the system
        try 
        {
            System.out.println("Remaoining Available Seats are:");
            s1.viewAvailableSeats();

            String bookingId = b1.bookSeats(Arrays.asList("A1", "B1"));

            b1.viewBookingDetails(bookingId);

            b1.cancelBooking(bookingId);

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        
    }
}
        
    

