package model;


public class Seat {
    private String seatId;
    private SeatType seatType;
    private double price;
    private SeatStatus status;

    public Seat(String seatId, SeatType seatType, double price) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.price = price;
        this.status = SeatStatus.AVAILABLE;
    }

    // by using getter
    public String getSeatId() {
        return seatId;// and returning the Seat ID
    }

    public double getPrice() {
        return price;// by returing the seat price
    }

    public SeatStatus getStatus() 
    {
        
        return status;//  status
    }

    public void book()
    {
        this.status = SeatStatus.BOOKED;
    }

    public void cancel() {
        this.status = SeatStatus.AVAILABLE;
    }

    @Override // by overriding
    public String toString() 
    {
        return seatId + "**" + seatType + "*$* " + price + "** " + status;
    }
}
