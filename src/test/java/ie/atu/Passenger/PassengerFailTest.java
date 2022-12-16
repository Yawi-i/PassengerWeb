package ie.atu.Passenger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PassengerFailTest {
    private Passenger myPassenger;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testTitleFail(){
        assertThrows(IllegalArgumentException.class, () -> { myPassenger = new Passenger(null, null, null, 0, 0); });

    }

    @Test
    void testNameFail(){
         assertThrows(IllegalArgumentException.class, () -> { myPassenger = new Passenger(null, null, null, 0, 0);});

    }

    @Test
    void testIdFail(){
        assertThrows(IllegalArgumentException.class, () -> { myPassenger = new Passenger(null, null, null, 0, 0);});

    }

    @Test
    void testPhoneFail(){
        assertThrows(IllegalArgumentException.class, () -> { myPassenger = new Passenger(null, null, null, 0, 0);});

    }

    @Test
    void testAgeFail(){
        assertThrows(IllegalArgumentException.class, () -> { myPassenger = new Passenger(null, null, null, 0, 0);});
    }

}