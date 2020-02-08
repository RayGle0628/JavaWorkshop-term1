package assignments.WS1;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 */
import java.util.Scanner;

public class test8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String s[] = str.split(":");
        int h, m;
        h = Integer.valueOf(s[0]);
        m = Integer.valueOf(s[1]);
        double gap = (30 * h - 5.5 * m) % 360;
        System.out.println("时针与分针的夹角为：" + gap);
    }

}
