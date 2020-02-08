package assignments.WS1;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 */

import java.util.Scanner;

/**
 *完成两种测试
 *  1.计算任意时间时针和分针的夹角度数
 *      1）键盘输入时间
 *      2）调用Clock类的calc方法
 *         计算夹角的算式：
 *              number = min*6-(hour*30+30*min/60)
 *  2.获取当前时间并计算夹角
 */

public class ClockDemo {
    public static void main(String[] args) {
       System.out.println("请输入时间，格式（xx:xx）");
       while(true) {
           Scanner sc = new Scanner(System.in);
           String time = sc.nextLine();
         Clock.calc(time);

       }


    }

}

