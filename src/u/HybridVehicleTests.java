package u;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import c.HybridVehicle;

/**
 * Unit tests for the HybridVehicle class.
 */
public class HybridVehicleTests {

    private HybridVehicle hybrid;

    /**
     * Sets up a HybridVehicle instance before each test.
     */
    @Before
    public void setUp() {
        hybrid = new HybridVehicle(15.0, 50.0);  // 15 gallons of fuel and 50 kWh of electric capacity
    }

    /**
     * Tests the fuelCost method.
     */
    @Test
    public void testFuelCost() {
        double pricePerGallon = 3.5;
        double gallons = 10.0;
        double expectedCost = 35.0;
        assertEquals(expectedCost, hybrid.fuelCost(pricePerGallon, gallons), 0.0001);
    }

    /**
     * Tests the chargeCost method.
     */
    @Test
    public void testChargeCost() {
        double pricePerKWh = 0.15;
        double kWh = 40.0;
        double expectedCost = 6.0;
        assertEquals(expectedCost, hybrid.chargeCost(pricePerKWh, kWh), 0.0001);
    }

    /**
     * Tests the totalCost method.
     */
    @Test
    public void testTotalCost() {
        double pricePerGallon = 3.5;
        double gallons = 10.0;
        double pricePerKWh = 0.15;
        double kWh = 40.0;
        double expectedCost = 41.0;
        assertEquals(expectedCost, hybrid.totalCost(pricePerGallon, gallons, pricePerKWh, kWh), 0.0001);
    }
}
