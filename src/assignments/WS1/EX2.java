package assignments.WS1;
/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 *
 */


public class EX2 {
    /**
     * a method to convert types to kg
     * @param  ton  Weight measurement unit
     * @param hundredweight       Weight measurement unit
     * @param quarter  Weight measurement unit
     * @param stone   Weight measurement unit
     * @param pound   Weight measurement unit
     * @param ounce  Weight measurement unit
     * @param drachm  Weight measurement unit
     * @param grain  Weight measurement unit
     * @return The value of each unit of measurement converted to kg
     */
    public static double imperialToKg(double ton,double hundredweight,
                                      double quarter, double stone,
                                      double pound, double ounce,
                                      double drachm, double grain){
        double kg =
                (ton * 1016.04691) + (hundredweight *50.8023454)+(quarter*12.7005864)+(stone*6.35029318)+
                        (ounce * 0.02834952)+ (drachm*0.00177185) + (grain * 0.0000648)+(pound * 0.45359237);

        return kg;
    }

    public static void main(String[] args) {
        System.out.println(imperialToKg(0,0,0,11,6,0,0,0));
    }
}
