package assignments.WS2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
        *This file contains 9 JUnit tests for demonstrating assertEquals,
        *  assertFalse, and asserTrue.
        *Using JUnit5 as a framework for testing, it includes testing all the setter
        *  and getter methods and the toString method of main class.
        * @Version 1.0
        * @Author:Mingrui Li 2087184 mxl991
        * @Date:2019/10/11
        * @Content:workshop
        */
class CarTest {

    @Test
    void getMake() {
        Car car1 = new Car("small",50000,220,"blue");
        String expected = "small";
        assertEquals(expected,car1.getMake(),"fail in getMake test");
    }


    @Test
    void setMake() {
        Car car1 = new Car("small",50000,220,"blue");
        car1.setMake("big");
        assertEquals("big",car1.getMake(),"fail in setMake test");
    }

    @Test
    void getPrice() {
        Car car1 = new Car("small",50000,220,"blue");
       int expected = 50000;
        assertEquals(expected,car1.getPrice(),"fail in getPrice test");
    }

    @Test
    void setPrice() {
        Car car1 = new Car("small",50000,220,"blue");
        car1.setPrice(120000);
        assertEquals(120000,car1.getPrice(),"fail in setPrice test");
    }

    @Test
    void getMaxSpeed() {
        Car car1 = new Car("small",50000,220,"blue");
        int expected = 220;
        assertEquals(expected,car1.getMaxSpeed(),"fail in getMaxSpeed test");
    }

    @Test
    void setMaxSpeed() {
        Car car1 = new Car("small",50000,220,"blue");
        car1.setMaxSpeed(230);
        assertEquals(230,car1.getMaxSpeed(),"fail in setMaxSpeed test");
    }

    @Test
    void getColour() {
        Car car1 = new Car("small",50000,220,"blue");
        String expected = "blue";
        assertEquals(expected,car1.getColour(),"fail in getColour test");
    }

    @Test
    void setColour() {
        Car car1 = new Car("small",50000,220,"blue");
        car1.setColour("green");
        assertEquals("green",car1.getColour(),"fail in setColour test");
    }

    @Test
    void toString1() {
        Car car1 = new Car("small",50000,220,"blue");
        String expected = "Car{" +
                "make='" + "small" + '\'' +
                ", price=" + 50000 +
                ", maxSpeed=" + 220 +
                ", colour='" + "blue" + '\'' +
                '}';
        String actual = car1.toString();
        assertEquals(expected,actual,"fail toString test");
    }
}