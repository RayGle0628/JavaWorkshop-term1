package assignments.WS2;

/**
 * this class is used to describe a good.It contains two
 *      attributes:name and netPrice
 *    We distinguish two field variable:
 *
 *      name, the official name of a good
 *     netPrice, a double number to represent the netprice of a item
 *
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/11
 * @Content:workshop
 */
public class Good {
    private String name;
    private double netPrice;


    /**Good is a constructor  for a very simple way to creat a good
     * @param name  the official name of a good
     * @param netPrice a double number to represent the netprice of a item
     */
    public Good(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    /**
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**set the name  of a good
     * @param name  the official name of a good
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the netprice of the item
     */
    public double getNetPrice() {
        return netPrice;
    }

    /**set the  netPrice of a good
     * @param netPrice a double number to represent the netprice of a item
     */
    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }



    /**
     *Set a static double variable to indicate the tax rate in a permanent
     *      * and fixed
     */
    final static double VAT_RATE =20;

    /**
     * @return The total price of the product, including the
     * netprice and tax of the product
     */

    public double grossPrice(){
        return netPrice * ((100+VAT_RATE)/100);

    }

    /** set a discount number
     * @param rate  a double number to represent the discount of a item
     */


    public void  discount(double rate){
        netPrice =
                 (netPrice*(100-rate)/100);
    }
    /**toString defines how to print a good
     * @return The object in a human readable form.
     */
    @Override
    public String toString() {

        return "The " + name+" has a gross price of \u00A3"+
                String.format("%" +
                ".2f", grossPrice())+".";

    }

    public static void main(String[] args) {
        Good milk = new Good("Milk",0.5);
        System.out.println(milk);
        milk.discount(20);
        System.out.println(milk);

    }
}
