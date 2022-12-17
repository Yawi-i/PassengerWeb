package ie.atu.Passenger;

import jakarta.persistence.PostUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {


    PassengerService myService;

    public PassengerController(PassengerService myService) {
        this.myService = myService;
    }

    @GetMapping
    public List<Passenger> getPassengers()
    {
        return myService.getPassengers();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID){

        return myService.getPassenger(passengerID);
    }

    //save operation
    @PostMapping("")
    public void savePassenger(@RequestBody Passenger passenger){
        myService.savePassenger(passenger);
    }

    //Find passenger by name
    @GetMapping("name/{name}")
    public Passenger getPassengerByName(@PathVariable("name") String name){
        return myService.findPassengerByName(name);
    }

    //Delete a passenger
    @DeleteMapping("delete/{count}")
    public void deletePassenger(@PathVariable("count")Long count){
        myService.deletePassenger(count);
    }

    //http://localhost:8081/api/passenger/age?age_start=1&age_end=60
    @GetMapping("/age")
    public List<Passenger> getPassengerByAge(@RequestParam(name = "age_start") int age1, @RequestParam(name = "age_end") int age2){
        return myService.findPassengerByAgeRange(age1, age2);
    }
}
