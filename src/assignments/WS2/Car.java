package assignments.WS2;

/**
 * This class is used to describe the cars.It contains four
 *  attributes:make,price,maxSpeed and colour.
 *  We distinguish four field variable:
 *
 *  make, the style of a car
 *  price, an int to represent the price of the car
 *  maxSpeed,  the maximum speed of a car
 *  colour, the colour of a car
 *
 * @Version 1.0
 * @Author:Mingrui Li 2087184   mxl991
 * @Date:2019/10/11
 * @Content:workshop
 */
public class Car {
    private String make;
    private int price;
    private int maxSpeed;
    private String colour;

    /**
     *Car is a constructor  for a very simple car product created
     * @param make  Car's style or quality
     * @param price  Car's price
     * @param maxSpeed Car's Top speed
     * @param colour Car's colour
     */
    public Car(String make, int price, int maxSpeed, String colour) {
        this.make = make;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    /**
     * @return the Make of the car as String
     */
    public String getMake() {
        return make;
    }

    /** set the make of a car
     * @param make a word to describe the style of a car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the price of the car as int
     */
    public int getPrice() {
        return price;
    }

    /**  set the price of a car
     * @param price  An integer used to represent the price of a car
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the MaxSpeed of the car as int
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**  set the top speed of a car
     * @param maxSpeed   An integer used to represent the maximum speed of a car
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return the colour of the car as String
     */
    public String getColour() {
        return colour;
    }

    /**  set the colour of a car
     * @param colour to represent the appearance color of the car
     */
    public void setColour(String colour) {
        this.colour = colour;
    }


    /** toString defines how to print a car
     * @return the print type of a car;Make the final code readable
     *  and let the object be in a human readable form.
     */
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", colour='" + colour + '\'' +
                '}';
    }
}
