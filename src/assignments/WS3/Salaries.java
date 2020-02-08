package assignments.WS3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/30
 * @Content:workshop
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Salaries {
    private ArrayList<double[]> allSalaries;

    public Salaries() {

        allSalaries = new ArrayList<double[]>();
    }

    public void add(double[] employeeSalaries) {
        allSalaries.add(employeeSalaries);
    }

    /**
     * @param employeeSalaries  an array of doubles; each index of the array
     *                          represents
     * the earnings of an employee for that particular month.
     *
     * @return average salary of an employee.
     */
    public static double average(double[] employeeSalaries) {
        double totalSalary = 0;
        int totalMonths = 0;

        for (int i=0; i<employeeSalaries.length; i++) {
            if (employeeSalaries[i] > 0) {
                totalSalary += employeeSalaries[i];
                totalMonths++;
            }
        }
        if (totalSalary == 0) {
            throw new IllegalArgumentException("This person has no " +
                        "income.");
        }
        return totalSalary / totalMonths;
    }

    /**
     * Method traverses allSalaries calculating the average salary for each employee
     * and appending it to a newly a instantiated ArrayList.
     *
     * @return ArrayList containing average salaries for all employees with at least one
     * monthly salary above 0.
     */
    public ArrayList<Double> averageSalaries() {
        ArrayList<Double> averageSalaries = new ArrayList<Double>();

        for (int i=0; i<allSalaries.size(); i++) {
            try {
                double avgEmployeeSalary = average(allSalaries.get(i));
                averageSalaries.add(avgEmployeeSalary);
            } catch (IllegalArgumentException e) {
                System.out.println("Warning, please don't add employees with zero income.");
            }
        }
        return averageSalaries;
    }

    /**
     * Method creates a new instance of averageSalaries which it then traverses,
     * comparing each index (average employee salary) with the total average value
     * of all other indexes * 3.
     *
     * @return false if any employee average salary is greater than the average of
     * all other employee salaries * 3, true otherwise.
     */
    public boolean not3TimesHigher() {
        ArrayList<Double> avgS = averageSalaries();

        for (int i=0; i<avgS.size(); i++) {

            double employee = avgS.get(i);
            double[] allOtherEmployees = new double[avgS.size()];

            for (int j=0; j<allOtherEmployees.length; j++) {
                allOtherEmployees[j] = avgS.get(j);
            }
            if (employee > (average(allOtherEmployees) * 3)) {
                return false;
            }
        } return true;
    }

    public static void main(String[] args) {
        double[] johnSalary = { 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        Salaries salaries2 = new Salaries();
        salaries2.add(johnSalary);
        System.out.println(Arrays.toString(johnSalary));
    }
}