package c;

/**
 * Interface representing electric vehicle charging operations.
 */
public interface ElectricInterface {

    /**
     * Calculates the cost of charging the vehicle with electricity.
     * 
     * @param pricePerKWh The price per kilowatt-hour (kWh).
     * @param kWh The amount of kilowatt-hours to charge.
     * @return The total cost of the electric charge.
     */
    double chargeCost(double pricePerKWh, double kWh);
}
