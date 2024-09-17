package c;

/**
 * Interface representing gasoline-related operations.
 */
public interface GasolineInterface {
    
    /**
     * Calculates the cost of fueling the vehicle with gasoline.
     * 
     * @param pricePerGallon The price per gallon of gasoline.
     * @param gallons The amount of gallons to fuel.
     * @return The total cost of the gasoline.
     */
    double fuelCost(double pricePerGallon, double gallons);
}
