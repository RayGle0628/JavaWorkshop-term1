package assignments.WS2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/18
 * @Content:workshop
 */
class FilmTest {
    private Date date;
    private Film adAstra;
    @BeforeEach
    public void init() {
        date = new Date(20, "October", 2018);
        adAstra = new Film("doom", date, 123);
    }

    @Test
    void test1() {
        int expectedDay = 20;
        int actualDay = adAstra.getReleaseDate().getDay();
        assertEquals(expectedDay, actualDay, "failure in test1: " + " expected day does not equal the actual day");
    }

    @Test
    public void test2() {
        String expectedMonth = "October";
        String actualMonth = adAstra.getReleaseDate().getMonth();
        assertEquals(expectedMonth, actualMonth,
                "failure in test2: " + " expected month does not equal the actual month");
    }

    @Test
    public void test3() {
        int expectedYear = 2018;
        int actualYear = adAstra.getReleaseDate().getYear();
        assertEquals(expectedYear, actualYear, "failure in test3: " + " expected year does not equal the actual year");
    }

    @Test
    public void test4() {
        String expectedTitle = "doom";
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
        Date updatedReleaseDate = new Date(05, "October", 2021);
        adAstra.setReleaseDate(updatedReleaseDate);

        String expectedDate = "5 October 2021";
        String actualDate = adAstra.getReleaseDate().toString();

        assertEquals(expectedDate, actualDate, "failure in test6: " + " expected date does not equal the actual date");
    }


}
