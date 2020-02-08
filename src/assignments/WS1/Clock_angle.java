package assignments.WS1;


import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 */
public class Clock_angle {


        private float hour;
        private float minute;

        //通过set函数设置时针与分针
        public void set(float hour, float minute) {
            this.hour = hour;
            this.minute = minute;
        }

        //get函数计算并输出结果
        public void get() {
            //将时钟的一圈分为60小格，每小格为一分钟，对应的角度为6度
            //时针偏移格数：七点三十分时，时针恰好介于7与8之间，则时针偏移了2.5格
            float angle = 0;
            if (hour * 5 > minute) {//时针 > 分针
                if (hour * 5 - minute < 30) {//时针 - 分针格数 = 锐角
                    angle = (((hour * 5) - minute) - ((minute / 60) * 5)) * 6;
                    //角度 = （时针 - 分针格数 - 时针偏移格数）* 6（一格为6度）
                } else {//时针 - 分针格数 = 钝角
                    angle = 360 - (((hour * 5) - minute) + ((minute / 60) * 5)) * 6;
                    //角度 = 360 - （时针 - 分针 + 时针偏移格数）* 6
                }
            } else if (hour * 5 <= minute) {//分针 >= 时针
                if (minute - hour * 5 < 30) {//分针 - 时针格数 = 锐角
                    angle = ((minute - hour * 5) - ((minute / 60) * 5)) * 6;
                    //角度 = （分针 - 时针 - 时针偏移格数）* 6
                } else {//分针 - 时针格数 = 钝角
                    angle = 360 - ((minute - hour * 5) + ((minute / 60) * 5)) * 6;
                    //角度 = 360 - （分针 - 时针 + 时针偏移格数）* 6
                }
            }
            System.out.println("angle :" + " " + angle);
        }

        public static void main(String[] args) {
            //创建对象time
            Clock_angle time = new Clock_angle();
            Scanner in = new Scanner(System.in);
            //输入小时
            System.out.println("input hour :");
            float hour = in.nextInt();
            //输入分钟
            System.out.println("input minute :");
            float minute = in.nextInt();
            //将时间传入get函数
            time.set(hour, minute);
            //计算并输出结果
            time.get();
        }
    }


