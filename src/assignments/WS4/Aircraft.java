package assignments.WS4;

/**
 * This class is mainly used to describe Aircraft, which contains two variables
 * passengerNumber and maxSpeed.
 * There are also some getter and setter methods and a tostring() method.
 * It is also the parent class of Aeroplane and is inherited by Aeroplane.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/6
 * @Content:workshop
 */
public class Aircraft {
    private int passengerNumber;
    private  int maxSpeed;

    /** Constructor
     * @param passengerNumber the total number of the passengers in the Aircraft
     * @param maxSpeed the Maximum speed of the Aircraft
     */
    public Aircraft(int passengerNumber, int maxSpeed) {
        this.passengerNumber = passengerNumber;
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return the total number of the passengers in the Aircraft
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * @param passengerNumber set the total number of the passengers in the Aircraft
     */
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    /**
     * @return the Maximum speed of the Aircraft
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @param maxSpeed set the Maximum speed of the Aircraft
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return a visual and formatted statement that can be printed to the console
     */
    @Override
    public String toString() {
        return "Aircraft{" +
                "passengerNumber=" + passengerNumber +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
