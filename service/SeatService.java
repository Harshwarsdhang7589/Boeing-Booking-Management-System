package service;
import exception.*;
import java.util.*;
import model.*;

public class SeatService {
    private Map<String, Seat> seats = new HashMap<>();// by using hasmap 

    public SeatService() {
        
        seats.put("A1",new Seat("A1",SeatType.REGULAR,150));
        seats.put("A2", new Seat("A2", SeatType.REGULAR, 150));
        seats.put("B1", new Seat("B1", SeatType.PREMIUM, 250));
        seats.put("B2", new Seat("B2", SeatType.PREMIUM, 250));
    }

    public Seat getSeat(String seatId) throws InvalidSeatException {
        if (!seats.containsKey(seatId)) {
            throw new InvalidSeatException("Invalid Seat ID: " + seatId);
        }
        return seats.get(seatId);
    }

    public void viewAvailableSeats() {
        seats.values().stream()
                .filter(s -> s.getStatus() == SeatStatus.AVAILABLE)
                .forEach(System.out::println);
    }
}
