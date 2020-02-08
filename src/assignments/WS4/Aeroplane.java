package assignments.WS4;

/**
 This class inherits from the class Aircraft,
 which not only has two variables, Aircraft's passengerNumber and maxSpeed.
 There is also a variable fuelConsumption.
 And rewrote some methods
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/12
 * @Content:workshop
 */
public class Aeroplane extends Aircraft{
    private double fuelConsumption;

    /** Constructor
     * @param passengerNumber the total number of the passengers in the Aeroplane
     * @param maxSpeed the Maximum speed of the Aeroplane
     * @param fuelConsumption  the fuel Consumption of the Aeroplane
     */
    public Aeroplane(int passengerNumber, int maxSpeed, double fuelConsumption) {
        super(passengerNumber, maxSpeed);
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * @return the fuel Consumption of the Aeroplane
     */
    public double getFuelConsumption() {

        return fuelConsumption;
    }

    /**
     * @param fuelConsumption set the fuel Consumption of the Aeroplane
     */
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * @return a visual and formatted statement that can be printed to the console
     */
    @Override
    public String toString() {
        return "Aeroplane{" +
                "fuelConsumption=" + fuelConsumption +
                '}';
    }
}
