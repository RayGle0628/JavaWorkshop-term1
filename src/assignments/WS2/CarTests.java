package assignments.WS2;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/15
 * @Content:workshop
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 *  The class contains 47 tests to test the constructor, the getters,
 *  and the setters in the Car class.
 *
 *  @author Manfred Kerber
 *  @version 2019-10-15
 */
public class CarTests {

    private Car c1;
    private Car c2;
    private Car c3;
    private Car c4;
    private Car c5;
    private Car c6;

    @BeforeEach
    public void beforeEach() {
        //    public Car(String make, int price, int maxSpeed, String colour){

        c1 = new Car("Ford", 20000, 150, "blue");
        c2 = new Car("Toyota", 25000, 160, "green");
        c3 = new Car("Renault", 19999, 140, "red");
        c4 = new Car("VW", 18888, 149, "yellow");
        c5 = new Car("", 0, 10, "black");
        c6 = new Car("", -100, 0, "white");
    }

    // testing getter for make
    @Test
    public void testMake1() {
        String expected = "Ford";
        String actual = c1.getMake();
        assertEquals(expected, actual, "error in getMake");
    }
    @Test
    public void testMake2() {
        String expected = "Toyota";
        String actual = c2.getMake();
        assertEquals(expected, actual, "error in getMake");
    }
    @Test
    public void testMake3() {
        String expected = "Renault";
        String actual = c3.getMake();
        assertEquals(expected, actual, "error in getMake");
    }
    @Test
    public void testMake4() {
        String expected = "VW";
        String actual = c4.getMake();
        assertEquals(expected, actual, "error in getMake");
    }
    @Test
    public void testMake5() {
        String expected = "";
        String actual = c5.getMake();
        assertEquals(expected, actual, "error in getMake");
    }

    // testing getter for price
    @Test
    public void testPrice1() {
        int expected = 20000;
        int actual = c1.getPrice();
        assertEquals(expected, actual, "error in getPrice");
    }
    @Test
    public void testPrice2() {
        int expected = 25000;
        int actual = c2.getPrice();
        assertEquals(expected, actual, "error in getPrice");
    }
    @Test
    public void testPrice3() {
        int expected = 19999;
        int actual = c3.getPrice();
        assertEquals(expected, actual, "error in getPrice");
    }
    @Test
    public void testPrice4() {
        int expected = 18888;
        int actual = c4.getPrice();
        assertEquals(expected, actual, "error in getPrice");
    }
    @Test
    public void testPrice5() {
        int expected = 0;
        int actual = c5.getPrice();
        assertEquals(expected, actual, "error in getPrice");
    }
    @Test
    public void testPrice6() {
        int expected = -100;
        int actual = c6.getPrice();
        assertEquals(expected, actual, "error in getPrice");
    }

    // testing getter for maxSpeed
    @Test
    public void testmaxSpeed1() {
        int expected = 150;
        int actual = c1.getMaxSpeed();
        assertEquals(expected, actual, "error in getMaxSpeed");
    }
    @Test
    public void testmaxSpeed2() {
        int expected = 160;
        int actual = c2.getMaxSpeed();
        assertEquals(expected, actual, "error in getMaxSpeed");
    }
    @Test
    public void testmaxSpeed3() {
        int expected = 140;
        int actual = c3.getMaxSpeed();
        assertEquals(expected, actual, "error in getMaxSpeed");
    }
    @Test
    public void testmaxSpeed4() {
        int expected = 149;
        int actual = c4.getMaxSpeed();
        assertEquals(expected, actual, "error in getMaxSpeed");
    }
    @Test
    public void testmaxSpeed5() {
        int expected = 10;
        int actual = c5.getMaxSpeed();
        assertEquals(expected, actual, "error in getMaxSpeed");
    }
    @Test
    public void testmaxSpeed6() {
        int expected = 0;
        int actual = c6.getMaxSpeed();
        assertEquals(expected, actual, "error in getMaxSpeed");
    }

    // testing getter for colour
    @Test
    public void testColour1() {
        String expected = "blue";
        String actual = c1.getColour();
        assertEquals(expected, actual, "error in getColour");
    }
    @Test
    public void testColour2() {
        String expected = "green";
        String actual = c2.getColour();
        assertEquals(expected, actual, "error in getColour");
    }
    @Test
    public void testColour3() {
        String expected = "red";
        String actual = c3.getColour();
        assertEquals(expected, actual, "error in getColour");
    }
    @Test
    public void testColour4() {
        String expected = "yellow";
        String actual = c4.getColour();
        assertEquals(expected, actual, "error in getColour");
    }
    @Test
    public void testColour5() {
        String expected = "black";
        String actual = c5.getColour();
        assertEquals(expected, actual, "error in getColour");
    }
    @Test
    public void testColour6() {
        String expected = "white";
        String actual = c6.getColour();
        assertEquals(expected, actual, "error in getColour");
    }

    // testing setter for make
    @Test
    public void testSetMake1() {
        c1.setMake("Vauxhall");
        String expected = "Vauxhall";
        String actual = c1.getMake();
        assertEquals(expected, actual, "error in setMake");
    }
    @Test
    public void testSetMake2() {
        c2.setMake("Porsche");
        String expected = "Porsche";
        String actual = c2.getMake();
        assertEquals(expected, actual, "error in setMake");
    }
    @Test
    public void testSetMake3() {
        c3.setMake("Tesla");
        String expected = "Tesla";
        String actual = c3.getMake();
        assertEquals(expected, actual, "error in setMake");
    }
    @Test
    public void testSetMake4() {
        c4.setMake("Rolls Royce");
        String expected = "Rolls Royce";
        String actual = c4.getMake();
        assertEquals(expected, actual, "error in setMake");
    }
    @Test
    public void testSetMake5() {
        c5.setMake("");
        String expected = "";
        String actual = c5.getMake();
        assertEquals(expected, actual, "error in setMake");
    }
    @Test
    public void testSetMake6() {
        c6.setMake("Mini");
        String expected = "Mini";
        String actual = c6.getMake();
        assertEquals(expected, actual, "error in setMake");
    }

    // testing setter for price
    @Test
    public void testSetPrice1() {
        c1.setPrice(-100);
        int expected = -100;
        int actual = c1.getPrice();
        assertEquals(expected, actual, "error in setPrice");
    }
    @Test
    public void testSetPrice2() {
        c2.setPrice(0);
        int expected = 0;
        int actual = c2.getPrice();
        assertEquals(expected, actual, "error in setPrice");
    }
    @Test
    public void testSetPrice3() {
        c3.setPrice(1000);
        int expected = 1000;
        int actual = c3.getPrice();
        assertEquals(expected, actual, "error in setPrice");
    }
    @Test
    public void testSetPrice4() {
        c4.setPrice(100000);
        int expected = 100000;
        int actual = c4.getPrice();
        assertEquals(expected, actual, "error in setPrice");
    }
    @Test
    public void testSetPrice5() {
        c5.setPrice(20);
        int expected = 20;
        int actual = c5.getPrice();
        assertEquals(expected, actual, "error in setPrice");
    }
    @Test
    public void testSetPrice6() {
        c6.setPrice(1000000);
        int expected = 1000000;
        int actual = c6.getPrice();
        assertEquals(expected, actual, "error in setPrice");
    }

    // testing setter for maxSpeed
    @Test
    public void testSetMaxSpeed1() {
        c1.setMaxSpeed(10);
        int expected = 10;
        int actual = c1.getMaxSpeed();
        assertEquals(expected, actual, "error in setMaxSpeed");
    }
    @Test
    public void testSetMaxSpeed2() {
        c2.setMaxSpeed(0);
        int expected = 0;
        int actual = c2.getMaxSpeed();
        assertEquals(expected, actual, "error in setMaxSpeed");
    }
    @Test
    public void testSetMaxSpeed3() {
        c3.setMaxSpeed(100);
        int expected = 100;
        int actual = c3.getMaxSpeed();
        assertEquals(expected, actual, "error in setMaxSpeed");
    }
    @Test
    public void testSetMaxSpeed4() {
        c4.setMaxSpeed(200);
        int expected = 200;
        int actual = c4.getMaxSpeed();
        assertEquals(expected, actual, "error in setMaxSpeed");
    }
    @Test
    public void testSetMaxSpeed5() {
        c5.setMaxSpeed(199);
        int expected = 199;
        int actual = c5.getMaxSpeed();
        assertEquals(expected, actual, "error in setMaxSpeed");
    }
    @Test
    public void testSetMaxSpeed6() {
        c6.setMaxSpeed(500);
        int expected = 500;
        int actual = c6.getMaxSpeed();
        assertEquals(expected, actual, "error in setMaxSpeed");
    }

    // testing setter for setColour
    @Test
    public void testSetColour1() {
        c1.setColour("brown");
        String expected = "brown";
        String actual = c1.getColour();
        assertEquals(expected, actual, "error in setColour");
    }
    @Test
    public void testSetColour2() {
        c2.setColour("");
        String expected = "";
        String actual = c2.getColour();
        assertEquals(expected, actual, "error in setColour");
    }
    @Test
    public void testSetColour3() {
        c3.setColour("pink");
        String expected = "pink";
        String actual = c3.getColour();
        assertEquals(expected, actual, "error in setColour");
    }
    @Test
    public void testSetColour4() {
        c4.setColour("orange");
        String expected = "orange";
        String actual = c4.getColour();
        assertEquals(expected, actual, "error in setColour");
    }
    @Test
    public void testSetColour5() {
        c5.setColour("metallic");
        String expected = "metallic";
        String actual = c5.getColour();
        assertEquals(expected, actual, "error in setColour");
    }
    @Test
    public void testSetColour6() {
        c6.setColour("blue");
        String expected = "blue";
        String actual = c6.getColour();
        assertEquals(expected, actual, "error in setColour");
    }

}
