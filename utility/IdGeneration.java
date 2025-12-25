package utility;


public class IdGeneration {
    private  static int bookingCounter=1000;
    
    public static String GenerateBookingId()
     {

        return "BOOKING ID GENERATION:" + (bookingCounter);
    }
}
