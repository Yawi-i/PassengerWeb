package ie.atu.Passenger;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassengers()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Yael", "6666666666", 12345, 16),
                new Passenger("Mr", "Yael2", "9999999999", 12345, 16),
                new Passenger("Mr", "Yael3", "4444444444", 12345, 16));

        return myPassengers;
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Yael", "6666666666", 12345, 16);
        return myPassenger;
    }

}
