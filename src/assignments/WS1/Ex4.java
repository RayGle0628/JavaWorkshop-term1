package assignments.WS1;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 */
public class Ex4 {
    /**
     * @param a An array
     * return Two exchanged numbers
     */
    public static void swap(int a[]){
        //Java cannot implement the exchange of two integers by value passing.
        //Temporarily can only be exchanged by array:
//Array pass implementation exchanges two integers
        int t;
        t = a[0];
        a[0] = a[1];
        a[1] = t;


    }
    public static void main(String args[]){

        int []a = new int[2];
        a[0] = 2;
        a[1] = 6;

        System.out.println("Original i: "
                + a[0] + " k: " + a[1]);
        swap(a);
        System.out.println("After swapping i: "
                + a[0] + " k: " + a[1]);
    }

}
