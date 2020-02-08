package assignments.WS1;
/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 *
 */


public class Ex1 {
    /**
     * A method to area of circle
     * @param radius   圆的半径
     * @return the area of the circle
     */
    public static double areaCircle(double radius){
        return Math.PI* radius*radius;
    }

    public static void main(String[] args) {
        System.out.println(areaCircle(0));
        System.out.println(areaCircle(5));
        System.out.println(areaCircle(10));
    }
}
