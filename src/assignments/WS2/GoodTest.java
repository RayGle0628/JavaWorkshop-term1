package assignments.WS2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** This file contains 7 JUnit tests for demonstrating assertEquals,
 *  assertFalse, and asserTrue.
 *  Using JUnit5 as a framework for testing, it includes testing all the setter
 *  and getter methods and the toString method of main class.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/11
 * @Content:workshop
 */
class GoodTest {

    @Test
    void getName() {
        Good good = new Good("milk", 0.5);
        String expected = "milk";
        assertEquals(expected, good.getName(), "fail in getName test");
    }

    @Test
    void setName() {
        Good good = new Good("milk", 0.5);
        good.setName("beef");
        assertEquals("beef", good.getName(), "fail in setName test");
    }

    @Test
    void getNetPrice() {
        Good good = new Good("milk", 0.5);
        double expected = 0.5;
        assertEquals(expected, good.getNetPrice(), "fail in grossPrice test");
    }

    @Test
    void setNetPrice() {
        Good good = new Good("milk", 0.5);
        good.setNetPrice(0.6);
        assertEquals(0.6, good.getNetPrice(), "fail in setNetPrice test");
    }

    @Test
    void toString1() {
        Good good = new Good("milk", 0.5);
        String expected = "The milk has a gross price of \u00A30.60.";
        String actual = good.toString();
        assertEquals(expected,actual,"fail toString test");
    }

    @Test
    void grossPrice() {
        Good good = new Good("milk", 0.5);
        double expected = 0.6;
        assertEquals(expected, good.grossPrice(), "fail in grossPrice " +
                "test");

    }

    @Test
    void discount() {
        Good good = new Good("milk", 0.5);
        double expected = 0.48;
        assertEquals(expected, 0.48, "fail in discount " +
                "test");
    }

}