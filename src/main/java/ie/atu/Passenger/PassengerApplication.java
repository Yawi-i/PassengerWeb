package ie.atu.Passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers()
	{
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Yael", "6666666666", 12345, 16),
				new Passenger("Mr", "Yael2", "9999999999", 12345, 16),
				new Passenger("Mr", "Yael3", "4444444444", 12345, 16));

		return myPassengers;
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		Passenger myPassenger = new Passenger("Mr", "Yael", "6666666666", 12345, 16);
		return myPassenger;
	}

}
