package assignments.WS2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import assignments.WS2.Film;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Public tests for the Film class.
 *
 * @author Alexandros Evangelidis and Manfred Kerber
 * @version 2019-10-15
 */
public class FilmTests {

    private Date date;
    private Film adAstra;

    @BeforeEach
    public void init() {
        date = new Date(18, "September", 2019);
        adAstra = new Film("Ad Astra", date, 123);
    }

    @Test
    public void test1() {
        int expectedDay = 18;
        int actualDay = adAstra.getReleaseDate().getDay();
        assertEquals(expectedDay, actualDay, "failure in test1: " + " expected day does not equal the actual day");
    }

    @Test
    public void test2() {
        String expectedMonth = "September";
        String actualMonth = adAstra.getReleaseDate().getMonth();
        assertEquals(expectedMonth, actualMonth,
                "failure in test2: " + " expected month does not equal the actual month");
    }

    @Test
    public void test3() {
        int expectedYear = 2019;
        int actualYear = adAstra.getReleaseDate().getYear();
        assertEquals(expectedYear, actualYear, "failure in test3: " + " expected year does not equal the actual year");
    }

    @Test
    public void test4() {
        String expectedTitle = "Ad Astra";
        String actualTitle = adAstra.getTitle();
        assertEquals(expectedTitle, actualTitle,
                "failure in test4: " + " expected title does not equal the actual title");
    }

    @Test
    public void test5() {
        int expectedLength = 123;
        int actualLength = adAstra.getLength();
        assertEquals(expectedLength, actualLength,
                "failure in test5: " + " expected length does not equal the actual length");
    }

    @Test
    public void test6() {
        Date updatedReleaseDate = new Date(03, "October", 2020);
        adAstra.setReleaseDate(updatedReleaseDate);

        String expectedDate = "3 October 2020";
        String actualDate = adAstra.getReleaseDate().toString();

        assertEquals(expectedDate, actualDate, "failure in test6: " + " expected date does not equal the actual date");
    }

    @Test
    public void test7() {
        Date updatedReleaseDate = new Date(01, "January", 2022);
        Film joker = new Film("Joker", updatedReleaseDate, 122);
        joker.setReleaseDate(new Date(04, "October", 2019));

        boolean expected = false;
        boolean actual = adAstra.getReleaseDate() == updatedReleaseDate;

        assertEquals(expected, actual, "failure in test7: " + " expected value date does not equal the actual value");

        assertFalse(joker.getTitle().equals(adAstra.getTitle()),
                "failure in test7: " + " titles of the two films should not be the same");

        assertTrue(!joker.getTitle().equals(adAstra.getTitle()),
                "failure in test7: " + " titles of the two films should not be the same");

        assertTrue(joker.getReleaseDate().getDay() != adAstra.getReleaseDate().getDay(),
                "failure in test7: " + " Days of the two films should not be equal to each other");

        assertTrue(joker.getReleaseDate().getYear() == adAstra.getReleaseDate().getYear(),
                "failure in test7: " + " Years of the two films should be equal to each other");
    }

}
