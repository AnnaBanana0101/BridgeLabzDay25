import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.CabFareCalculator;

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
}
