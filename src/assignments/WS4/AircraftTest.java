package assignments.WS4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**Private tests for Exercise 1, Worksheet 4.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/13
 * @Content:workshop
 */
public class AircraftTest {
    public static final double TOLERANCE = 0.0000000001;
    private Aircraft Helicopter;
    private Aeroplane Airbus_A350, Boeing_777;
    @BeforeEach
    public void init() {

        Helicopter = new Aircraft(8, 200);
        Boeing_777 = new Aeroplane(399, 1130, 13);
        Airbus_A350 = new Aeroplane(380, 1200, 14.5);
    }

    @Test
    public void test1() {

        int expectedNumOfPassengers = 8;
        int actualNumOfPassengers = Helicopter.getPassengerNumber();
        assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

        int expectedMaxSpeed = 200;
        int actualMaxSpeed = Helicopter.getMaxSpeed();
        assertEquals(expectedMaxSpeed, actualMaxSpeed);
    }
    @Test
    public void test2() {

        int expectedNumOfPassengers = 399;
        int actualNumOfPassengers = Boeing_777.getPassengerNumber();
        assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

        int expectedMaxSpeed = 1130;
        int actualMaxSpeed = Boeing_777.getMaxSpeed();
        assertEquals(expectedMaxSpeed, actualMaxSpeed);

    }
    @Test
    public void test3() {

        Airbus_A350.setPassengerNumber(320);
        int expectedNumOfPassengers = 320;
        int actualNumOfPassengers = Airbus_A350.getPassengerNumber();
        assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

        Airbus_A350.setMaxSpeed(770);
        int expectedMaxSpeed = 770;
        int actualMaxSpeed = Airbus_A350.getMaxSpeed();
        assertEquals(expectedMaxSpeed, actualMaxSpeed);
    }


    @Test
    public void test4() {

        Boeing_777.setPassengerNumber(355);
        int expectedNumOfPassengers = 355;
        int actualNumOfPassengers = Boeing_777.getPassengerNumber();
        assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

        Boeing_777.setMaxSpeed(777);
        int expectedMaxSpeed = 777;
        int actualMaxSpeed = Boeing_777.getMaxSpeed();
        assertEquals(expectedMaxSpeed, actualMaxSpeed);


        Boeing_777.setFuelConsumption(13.95);
        double expectedFuelCons = 13.95;
        double actualFuelCons = Boeing_777.getFuelConsumption();
        assertEquals(expectedFuelCons, actualFuelCons, TOLERANCE);
    }



    @Test
    public void test5() {

        int expectedNumOfPassengers = 380;
        int actualNumOfPassengers = Airbus_A350.getPassengerNumber();
        assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

        int expectedMaxSpeed = 1200;
        int actualMaxSpeed =  Airbus_A350.getMaxSpeed();
        assertEquals(expectedMaxSpeed, actualMaxSpeed);
    }


    @Test
    public void test6() {

        Airbus_A350.setPassengerNumber(390);
        int expectedNumOfPassengers = 390;
        int actualNumOfPassengers =  Airbus_A350.getPassengerNumber();
        assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

        Airbus_A350.setMaxSpeed(844);
        int expectedMaxSpeed = 844;
        int actualMaxSpeed =  Airbus_A350.getMaxSpeed();
        assertEquals(expectedMaxSpeed, actualMaxSpeed);
    }
}

