package assignments.WS3;

/**
 *   This class mainly uses an array of type double
 *   to store the temperature of each day of the year 365.
 *   A method to find the lowest temperature is implemented in the class.
 *   Using this method we can return the temperature of the coldest day,
 *   if there is more than one coldest day.
 *   Then return to the first coldest temperature.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/29
 * @Content:workshop
 */
public class Temperature {
    /**
     * @param temperature An array for storing temperature
     * @return the first day of the year with the lowest temperature
     */
    public static int coldest(double[] temperature){
        double coldestTemperature =temperature[0];
        int firstColdestDay =1;
        for (int i = 0;i <365 ; i++) {
            if (temperature[i]<coldestTemperature){
                coldestTemperature = temperature[i];
                firstColdestDay = i+1;
            }

        }
         return firstColdestDay;
    }
}
