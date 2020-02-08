package assignments.WS4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/13
 * @Content:workshop
 */
public class SubscriptionTest {
    private SubscriptionInterface subFather;
    private SubscriptionPrime subPrimeFather;
    private Subscription subChild;
    @BeforeEach
    public void init() {
        subFather = new Subscription("Economist", "41413133@gmail.com", 5);
        subPrimeFather = new SubscriptionPrime("reader", "jason@nba.com", 11,
                "NBA " +
                "BOSTON");
       subChild = new SubscriptionPrime("Know almost", "kembar@doom.org", 40,
               "Bristol street 15092");
    }
    @Test
    public void test1() {
        String expectedTitle = "Economist";
        String actualTitle =subFather.getTitle();
        assertEquals(expectedTitle, actualTitle, "title should be: " + actualTitle);
    }

    @Test
    public void test2() {
        String expectedEmail = "41413133@gmail.com";
        String actualEmail = subFather.getEmail();
        assertEquals(expectedEmail, actualEmail, "mail should be: " + actualEmail);
    }


    @Test
    public void test3() {
        int expectedCost = 5;
        int actualCost = subFather.getCost();
        assertEquals(expectedCost, actualCost, "cost should be: " + actualCost);
    }


    @Test
    public void test4() {
        String expectedTitle = "reader";
        String actualTitle = subPrimeFather.getTitle();
        assertEquals(expectedTitle, actualTitle, "title should be: " + actualTitle);
    }


    @Test
    public void test5() {
        String expectedEmail = "jason@nba.com";
        String actualEmail = subPrimeFather.getEmail();
        assertEquals(expectedEmail, actualEmail, "mail should be: " + actualEmail);

    }


    @Test
    public void test6() {
        int expectedCost = 11;
        int actualCost = subPrimeFather.getCost();
        assertEquals(expectedCost, actualCost, "cost should be: " + actualCost);
    }


    @Test
    public void test7() {
        String expectedDeliveryAddress = "NBA BOSTON";
        String actualDeliveryAddress = subPrimeFather.getAddress();
        assertEquals(expectedDeliveryAddress, actualDeliveryAddress,
                "address should be: " + actualDeliveryAddress);
    }


    @Test
    public void test8() {
        SubscriptionPrimeInterface subPrime2 =
                new SubscriptionPrime("reader", "jason@nba.com", 11,
                        "NBA02 BOSTON");
        String expectedAddress = "NBA02 BOSTON";
        String actualAddress = subPrime2.getAddress();
        assertEquals(expectedAddress, actualAddress, "address should be: " + actualAddress);
    }


    @Test
    public void test9() {
        String expectedTitle = "Know almost";
        String actualTitle = subChild.getTitle();
        assertEquals(expectedTitle, actualTitle, "title should be: " + actualTitle);
    }


    @Test
    public void test10() {
        String expectedEmail = "kembar@doom.org";
        String actualEmail = subChild.getEmail();
        assertEquals(expectedEmail, actualEmail, "email should be: " + actualEmail);
    }


    @Test
    public void test11() {
        int expectedCost = 40;
        int actualCost = subChild.getCost();
        assertEquals(expectedCost, actualCost, "cost should be: " + actualCost);
    }
}

