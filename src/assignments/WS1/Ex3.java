package assignments.WS1;
/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 */


/* Sorry, Professor, this topic is too difficult for me.
I thought about it for several nights and I didn't solve it.
I tried to use loops and conditions.
I look forward to hearing from you your answers and solutions. */
public class Ex3 {

    /**
     * @param hours
     * @param minutes
     * @return result Angle between hour and minute hands
     */
    public static int timeToAngle(int hours, int minutes) {
        int hoursToAngle = hours * 30;
        int minutesToAngle = minutes * 6;
        int result = hoursToAngle - minutesToAngle;
        if (result <0){
            Math.abs(result);
        }
        while (result >= 360 ){
            result = result-360;
        }

        return result;
    }



    public static void main(String[] args) {
        System.out.println(timeToAngle(9, 0) + "°");
        System.out.println(timeToAngle(3, 0) + "°");
        System.out.println(timeToAngle(18, 0) + "°");
        System.out.println(timeToAngle(1, 0) + "°");
        System.out.println(timeToAngle(2, 30) + "°");
        System.out.println(timeToAngle(4, 41) + "°");
    }
}
