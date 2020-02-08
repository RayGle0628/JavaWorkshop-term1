package assignments.WS2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This file contains 6 JUnit tests for demonstrating assertEquals,
 *   assertFalse, and asserTrue.
 * Using JUnit5 as a framework for testing, it includes testing all the setter
 *  and getter methods and the toString method of main class.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/14
 * @Content:workshop
 */
class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(5,10);
        double expected = 5;
        assertEquals(expected,rectangle.getWidth(),"fail in getWidth test");
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle(5,10);
        rectangle.setWidth(16);
        assertEquals(16,rectangle.getWidth(),"fail in setWidth test");
    }

    @Test
    void getHeight() {
        Rectangle rectangle = new Rectangle(5,10);
        double expected = 10;
        assertEquals(expected,rectangle.getHeight(),"fail in getHeight test");
    }

    @Test
    void setHeight() {
        Rectangle rectangle = new Rectangle(5,10);
        rectangle.setHeight(11);
        assertEquals(11,rectangle.getHeight(),"fail in setHeight test");
    }

    @Test
    void getperimeter() {
        Rectangle rectangle = new Rectangle(5,10);
        double expected = 30;
        assertEquals(expected,rectangle.getperimeter(),"fail in getperimeter test");
    }

    @Test
    void toString1() {
        Rectangle rectangle = new Rectangle(5.0,10.0);
        String expected ="Rectangle{" +
                "width=" + 5.0 +
                ", height=" +10.0 +
                ", perimeter=" + rectangle.getperimeter() +
                '}';
        String actual = rectangle.toString();
        assertEquals(expected,actual,"fail toString test");
    }
}