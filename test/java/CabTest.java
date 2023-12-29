import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.CabFareCalculator;
import com.example.Ride;

public class CabTest {
    
    @Test
    public void validateTestFare()
    {
        CabFareCalculator cabFareCalculator = new CabFareCalculator();
        double fare = cabFareCalculator.calculateFare(15,5);

        assertEquals(65.0, fare);
    }

    @Test
    public void validateMinimumFare()
    {
        CabFareCalculator cabFareCalculator = new CabFareCalculator();
        double fare = cabFareCalculator.calculateFare(2,0.2);

        assertEquals(5.0, fare);
    }

    @Test
    public void validateTotalFare()
    {
        CabFareCalculator cabFareCalculator = new CabFareCalculator();

        Ride[] rides = {
            new Ride(2,2),
            new Ride(4, 6),
            new Ride(2, 0.1)
        };

        int total_rides = rides.length;

        assertEquals(3, total_rides);

        double total_fare = cabFareCalculator.calculateFare(2, 2) + cabFareCalculator.calculateFare(4, 6) + cabFareCalculator.calculateFare(2, 0.1);
        assertEquals(91.0, total_fare);

        double average_fare = total_fare/total_rides;
        assertEquals(30.333333333333332, average_fare);



    }
}
