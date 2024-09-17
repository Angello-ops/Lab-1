package c;

/**
 * A class representing a hybrid vehicle that uses both gasoline and electric power.
 * Implements both GasolineInterface and ElectricInterface.
 */
public class HybridVehicle implements GasolineInterface, ElectricInterface {

    private double fuelCapacity;
    private double electricCapacity;

    /**
     * Constructs a HybridVehicle with specified fuel and electric capacities.
     * 
     * @param fuelCapacity The gasoline tank capacity in gallons.
     * @param electricCapacity The battery capacity in kWh.
     */
    public HybridVehicle(double fuelCapacity, double electricCapacity) {
        this.fuelCapacity = fuelCapacity;
        this.electricCapacity = electricCapacity;
    }

    /**
     * Calculates the cost of fueling with gasoline.
     * 
     * @param pricePerGallon The price per gallon of gasoline.
     * @param gallons The number of gallons to fuel.
     * @return The total cost, capped by the fuel capacity.
     */
    @Override
    public double fuelCost(double pricePerGallon, double gallons) {
        return pricePerGallon * Math.min(gallons, fuelCapacity);
    }

    /**
     * Calculates the cost of charging the vehicle with electricity.
     * 
     * @param pricePerKWh The price per kWh of electricity.
     * @param kWh The number of kWh to charge.
     * @return The total cost, capped by the battery capacity.
     */
    @Override
    public double chargeCost(double pricePerKWh, double kWh) {
        return pricePerKWh * Math.min(kWh, electricCapacity);
    }

    /**
     * Calculates the total cost of both fueling and charging the vehicle.
     * 
     * @param pricePerGallon The price per gallon of gasoline.
     * @param gallons The number of gallons to fuel.
     * @param pricePerKWh The price per kWh of electricity.
     * @param kWh The number of kWh to charge.
     * @return The total combined cost of fueling and charging.
     */
    public double totalCost(double pricePerGallon, double gallons, double pricePerKWh, double kWh) {
        return fuelCost(pricePerGallon, gallons) + chargeCost(pricePerKWh, kWh);
    }
}
