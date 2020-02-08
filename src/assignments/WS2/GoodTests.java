package assignments.WS2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import assignments.WS2.Good;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *  Public tests for the Good class.
 * @author Alexandros Evangelidis
 * @version 2019-10-15
 */
public class GoodTests {

    private Good milk;
    private Good bread;
    public final static double TOLERANCE = 0.000001;

    @BeforeEach
    public void setup() {
        milk = new Good("Milk", 0.50);
        bread = new Good("Bread", 1.15);
    }

    // testing getters of milk
    // and also public access of VAT_RATE
    @Test
    public void test1() {
        String expectedName = "Milk";
        double expectedNetPrice = 0.5;
        double expectedVATRate = 20;

        String actualName = milk.getName();
        double actualNetPrice = milk.getNetPrice();
        double actualVATRate = Good.VAT_RATE;
        assertEquals(expectedName, actualName, "failure in test1: " + " expected name does not match the actual name");
        assertEquals(expectedNetPrice, actualNetPrice, TOLERANCE,
                "failure in test1: " + " expected net price not approximately equal to computed net price");
        assertEquals(expectedVATRate, actualVATRate, TOLERANCE,
                "failure in test1: " + "" + " expected net price not approximately equal to computed net price");
    }

    // testing getters of bread
    @Test
    public void test2() {
        String expectedName = "Bread";
        double expectedNetPrice = 1.15;

        String actualName = bread.getName();
        double actualNetPrice = bread.getNetPrice();

        assertEquals(expectedName, actualName, "failure in test2: " + " expected name does not match the actual name");
        assertEquals(expectedNetPrice, actualNetPrice, TOLERANCE,
                "failure in test2: " + " expected net price not approximately equal to computed net price");
    }

    // testing setters and getters of milk
    @Test
    public void test3() {
        milk.setName("Whole milk");
        milk.setNetPrice(0.67);
        String expectedName = "Whole milk";
        double expectedNetPrice = 0.67;

        String actualName = milk.getName();
        double actualNetPrice = milk.getNetPrice();

        assertEquals(expectedName, actualName, "failure in test3: " + " expected name does not match the actual name");
        assertEquals(expectedNetPrice, actualNetPrice, TOLERANCE,
                "failure in test3: " + " expected net price not approximately equal to computed net price");

    }

    // testing setters and getters of bread
    @Test
    public void test4() {
        bread.setName("Rye bread");
        bread.setNetPrice(1.35);
        String expectedName = "Rye bread";
        double expectedNetPrice = 1.35;

        String actualName = bread.getName();
        double actualNetPrice = bread.getNetPrice();

        assertEquals(expectedName, actualName, "failure in test4: " + " expected name does not match the actual name");
        assertEquals(expectedNetPrice, actualNetPrice, TOLERANCE,
                "failure in test4: " + " expected net price not approximately equal to computed net price");

    }

    // testing grossPrice method of milk
    @Test
    public void test5() {
        double expectedGrossPrice = 0.6;
        double actualGrossPrice = milk.grossPrice();

        assertEquals(expectedGrossPrice, actualGrossPrice, TOLERANCE,
                "failure in test5: " + " expected gross price not approximately equal to computed gross price");

    }

    // testing grossPrice method of bread
    @Test
    public void test6() {
        double expectedGrossPrice = 1.38;
        double actualGrossPrice = bread.grossPrice();

        assertEquals(expectedGrossPrice, actualGrossPrice, TOLERANCE,
                "failure in test6: " + " expected gross price not approximately equal to computed gross price");

    }

    // testing toString method of milk
    @Test
    public void test7() {
        milk.setName("Whole milk");
        milk.setNetPrice(0.665);
        String expectedString = "The Whole milk has a gross price of \u00A30.80.";
        String actualString = milk.toString();
        assertEquals(expectedString, actualString,
                "failure in test7: " + " expected toString output does not match the actual one");

    }

    // testing toString method of bread
    @Test
    public void test8() {
        bread.setName("Rye bread");
        bread.setNetPrice(1.45);
        String expectedString = "The Rye bread has a gross price of \u00A31.74.";
        String actualString = bread.toString();
        assertEquals(expectedString, actualString,
                "failure in test8: " + " expected toString output does not match the actual one");

    }

    // testing the discount method (via calling the toString())
    @Test
    public void test9() {
        milk.discount(20);
        String expectedString = "The Milk has a gross price of \u00A30.48.";
        String actualString = milk.toString();
        assertEquals(expectedString, actualString,
                "failure in test9: " + " expected toString output does not match the actual one");
    }

    // testing the discount method (via calling the toString())
    @Test
    public void test10() {
        bread.discount(20);
        String expectedString = "The Bread has a gross price of \u00A31.10.";
        String actualString = bread.toString();
        assertEquals(expectedString, actualString,
                "failure in test10: " + " expected toString output does not match the actual one");
    }

    // testing the discount method (via calling the toString())
    @Test
    public void test11() {
        milk.discount(0);
        String expectedString = "The Milk has a gross price of \u00A30.60.";
        String actualString = milk.toString();
        assertEquals(expectedString, actualString,
                "failure in test11: " + " expected toString output does not match the actual one");
    }

    // testing the discount method (via calling the toString())
    @Test
    public void test12() {
        bread.discount(2.267);
        String expectedString = "The Bread has a gross price of \u00A31.35.";
        String actualString = bread.toString();
        assertEquals(expectedString, actualString,
                "failure in test12: " + " expected toString output does not match the actual one");
    }

    // testing the discount method (via calling the toString())
    @Test
    public void test13() {
        bread.setNetPrice(1.1111);
        bread.discount(-6.7254468);
        String expectedString = "The Bread has a gross price of \u00A31.42.";
        String actualString = bread.toString();
        assertEquals(expectedString, actualString,
                "failure in test13: " + " expected toString output does not match the actual one");
    }
}
