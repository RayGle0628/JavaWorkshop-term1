package assignments.WS4;

/**
 *This class describes the subscription Prime to a journal by
 *  * the 4 field variables title, email,
 *  * cost and deliveryAddress of types String, String,  int and String
 *  respectively.
 *  * It also implements an interface called SubscriptionPrimeInterface
 *  * and rewrites the methods inside.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/7
 * @Content:workshop
 */
public class SubscriptionPrime extends Subscription implements SubscriptionPrimeInterface {
    public String deliveryAddress;

    /**Constructor
     * @param title the title of a journal
     * @param email the email of someone in the journal
     * @param cost the cost of someone in the journal
     * @param deliveryAddress the address of someone in the journal
     */
    public SubscriptionPrime(String title, String email, int cost, String deliveryAddress) {
        super(title, email, cost);
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * @return the address of someone in the journal
     */
    @Override
    public String getAddress() {
        return this.deliveryAddress;
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {

        return super.toString();
    }

    /**
     * @return the title of someone in a  journal
     */
    @Override
    public String getTitle() {

        return super.getTitle();
    }

    /**
     * @return the email of someone in the journal
     */
    @Override
    public String getEmail() {

        return super.getEmail();
    }

    /**
     * @return the cost of someone in the journal
     */
    @Override
    public int getCost() {

        return super.getCost();
    }
}
