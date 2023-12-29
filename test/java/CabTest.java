import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.example.CabFareCalculator;
import com.example.Ride;
import com.example.User;

public class CabTest {
    
    @Test
    public void validateTestFare() throws Exception
    {
        CabFareCalculator cabFareCalculator = new CabFareCalculator("normal");
        double fare = cabFareCalculator.calculateFare(15,5);

        assertEquals(65.0, fare);
    }

    @Test
    public void validateMinimumFare() throws Exception
    {
        CabFareCalculator cabFareCalculator = new CabFareCalculator("normal");
        double fare = cabFareCalculator.calculateFare(2,0.2);

        assertEquals(5.0, fare);
    }

    @Test
    public void validateTotalFare() throws Exception
    {
        CabFareCalculator cabFareCalculator = new CabFareCalculator("normal");

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

    @Test
    public void validateInvoiceService() throws Exception
    {
        CabFareCalculator cabFareCalculator = new CabFareCalculator("normal");
        Ride[] rides = {
            new Ride(2,2),
            new Ride(4, 6),
            new Ride(2, 0.1)
        };

        String uid = "abc";
        ArrayList<Ride> list_of_rides = new ArrayList<>();
        list_of_rides = cabFareCalculator.addRides(uid, rides);
        double invoice =0;

        for(int i=0; i<list_of_rides.size(); i++)
        {
            invoice += cabFareCalculator.calculateFare(list_of_rides.get(i).time, list_of_rides.get(i).distance);
        }

        assertEquals(91.0, invoice);

    }
}
