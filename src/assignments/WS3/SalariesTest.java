package assignments.WS3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/31
 * @Content:workshop
 */
class SalariesTest {
    public static final double TOLERANCE = 0.0000000001;
    private Salaries salaries;
    @BeforeEach
    public void init() {
        salaries = new Salaries();
        double[] KobeSalary = { 3333, 1000, 222, 2000, 0, 0, 0, 0, 0, 0, 0,
                0 };
        double[] IryingSalary = { 1500, 1000, 1500, 1000, 0, 0, 0,
                0, 0, 0, 0, 0 };
        double[] JasonSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2800 };
        double[] JaylenSalary = { 0, 2000, 0, 3000, 0, 2110, 1350, 1400, 0, 0
                , 0, 0 };
        salaries.add(KobeSalary);
        salaries.add(IryingSalary);
        salaries.add(JasonSalary);
        salaries.add(JaylenSalary);
    }
    @Test
    public void test1() {
        double[] KobeSalary = { 3333, 1000, 222, 2000, 0, 0, 0, 0, 0, 0, 0,
                0 };
        double expectedAverage = 1638.75;
        double actualAverage = Salaries.average(KobeSalary);
        assertEquals(expectedAverage, actualAverage, TOLERANCE);
    }

    @Test
    public void test2() {
        double[] IryingSalary = { 1500, 1000, 1500, 1000, 0, 0, 0,
                0, 0, 0, 0, 0 };
        double expectedAverage = 1250;
        double actualAverage = Salaries.average(IryingSalary);
        assertEquals(expectedAverage, actualAverage, TOLERANCE);
    }

    @Test
    public void test3() {
        double[] JasonSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2800 };
        double expectedAverage = 2800;
        double actualAverage = Salaries.average(JasonSalary);
        assertEquals(expectedAverage, actualAverage, TOLERANCE);
    }

    @Test
    public void test4() {
        double[] JaylenSalary = { 0, 2000, 0, 3000, 0, 2110, 1350, 1400, 0, 0
                , 0, 0 };
        double expectedAverage = 1972.;
        double actualAverage = Salaries.average(JaylenSalary);
        assertEquals(expectedAverage, actualAverage, TOLERANCE);
    }

    @Test
    public void test5() {
        double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertThrows(IllegalArgumentException.class, () -> {
            Salaries.average(noSalary);
        });
    }
    @Test
    public void test6() {

        ArrayList<Double> expectedAverageSalaries = new ArrayList<>();
        expectedAverageSalaries.add(1638.75);
        expectedAverageSalaries.add(1250.);
        expectedAverageSalaries.add(2800.);
        expectedAverageSalaries.add(1972.);
        ArrayList<Double> actualAverageSalaries = salaries.averageSalaries();

        for (int i = 0; i < actualAverageSalaries.size(); i++) {
            assertEquals(expectedAverageSalaries.get(i), actualAverageSalaries.get(i), TOLERANCE);
        }
    }
    @Test
    public void test7() {
        double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        ArrayList<Double> expectedAverageSalaries = new ArrayList<>();
        expectedAverageSalaries.add(1638.75);
        expectedAverageSalaries.add(1250.);
        expectedAverageSalaries.add(2800.);
        expectedAverageSalaries.add(1972.);
        expectedAverageSalaries.add(0.);
        salaries.add(noSalary);
        ArrayList<Double> actualAverageSalaries = salaries.averageSalaries();

        for (int i = 0; i < actualAverageSalaries.size(); i++) {
            assertEquals(expectedAverageSalaries.get(i), actualAverageSalaries.get(i), TOLERANCE);

        }
    }
    @Test
    public void test8() {
        double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        double[] duduSalary = { 2500, 1542, 1345, 2415, 1246, 1876, 0, 0, 0, 0,
                0, 0 };
        ArrayList<Double> expectedAverageSalaries = new ArrayList<>();
        expectedAverageSalaries.add(1638.75);
        expectedAverageSalaries.add(1250.);
        expectedAverageSalaries.add(2800.);
        expectedAverageSalaries.add(1972.);
        expectedAverageSalaries.add(1820.666666666666);

        salaries.add(noSalary);
        salaries.add(duduSalary);
        ArrayList<Double> actualAverageSalaries = salaries.averageSalaries();

        for (int i = 0; i < actualAverageSalaries.size(); i++) {
            assertEquals(expectedAverageSalaries.get(i), actualAverageSalaries.get(i), TOLERANCE);

        }
    }
    @Test
    public void test9() {
        double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        double[] duduSalary = { 12500, 11542, 1345,12415, 1246, 1876, 0, 0, 0
                , 0,
                0, 0 };
        salaries.add(noSalary);
        salaries.add(duduSalary);
        assertTrue(salaries.not3TimesHigher());
    }
    @Test
    public void test10() {
        double[] xiaoxiaoSalary = { 100000, 10000, 1000,100, 0, 0, 0, 0, 0, 0
                , 0, 0 };
        salaries.add(xiaoxiaoSalary);
        assertFalse(salaries.not3TimesHigher());
    }
    @Test
    public void test11() {
        double[] minminSalary = { 1000, 2200, 3300, 4200, 0, 0, 0, 0, 0, 0, 0,
                0 };
        salaries.add(minminSalary);
        assertTrue(salaries.not3TimesHigher());
    }
    @Test
    public void test12() {
        double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        Salaries salaries2 = new Salaries();
        salaries2.add(noSalary);
        assertTrue(salaries2.not3TimesHigher());
    }
    @Test
    public void test13() {
        double[] dakeaiSalary = { 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0 };
        Salaries salaries2 = new Salaries();
        salaries2.add(dakeaiSalary);
        assertTrue(salaries2.not3TimesHigher());
    }
}
