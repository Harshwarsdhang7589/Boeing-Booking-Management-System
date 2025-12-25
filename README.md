 # PROJECT NO. 03  SEAT ALLOCATION SYSTEM:

Design an implement a Console-Based to build the system.The System should have real-world seat System Airline/Boeing/Railway Reservation System.

## FUNCTIONS REQUIRED ARE:

### Seat Management:
- Each Seat must have Id A1,A2....
- No of quantioty of seats
- Seat Type:Regular/Premium
- Price,Status:Available or not.

### Operation:
- View Available Seat
- Book Seat
- Cancellation
- View Booking Details

## Bussiness:
- Booking must Failed if any seat ID is invalid or already Booked
- Cancelling a Booking shpould all seat again.
- Total Price can be calaculated Again.

## Exception Handling:
- Handling Invalid Seating ID.
- Handle Booking of already Booked seat.
- Handle Cancellatio9n of Non-Booked Seat.

## Data Storage:
- Use java Collection Map List and follow OOP's Concept.

## Seat Booking System

 -> SRC
    --->Model
        -->Seat.java// seat entity(Requkar,Premium)
        -->SeatStatus.java//Available booking
        -->BookingStatus.java//Confirm or cancel

    --->Service
    // create  a booking function
        -->SeatService.java//
        -->BookingService.java//Booking Logic
        -->ExceptionHandling// Invalid Seat Exception.java
                            // Seat Already Book.java
                            // Bookingnotfound.java

    --->Utility
        -->IdGeneration.java//AutoBookingid.java
        -->Inputvalidation.java//Optional

-->Main class
    --->Main.java
