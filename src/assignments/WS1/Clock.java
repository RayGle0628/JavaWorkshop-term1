package assignments.WS1;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 */
public class Clock {
    //只写一个空参构造和一个静态方法
    public Clock() {
    }

    public static void calc(String time){         //计算夹角的方法

        int hour = Integer.parseInt(time.split(":")[0]);  //将时间字符串切割，分别得到时针分针当前所指位置
        int min = Integer.parseInt(time.split(":")[1]);
        if(hour>23 || hour<0 || min>59 || min<0){    //自定义异常在这使用，判断输入时间是否正确
            try {
                throw new MyException("输入时间有误！请重新输入");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }else {           //输入正确，则调用以下算式计算夹角
            double number = Math.abs(min * 6 - (hour * 30 + 30.00 * min / 60));
            number = number % 360;
            System.out.println("此时时针和分针的夹角为" + number + "°");
        }
    }

}
