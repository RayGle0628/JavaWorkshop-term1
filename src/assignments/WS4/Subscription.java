package assignments.WS4;

/** This class describes the subscription to a journal by
 * the 3 field variables title, email, and
 * cost of types String, String, and int, respectively.
 * It also implements an interface called SubscriptionInterface
 * and rewrites the methods inside.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/7
 * @Content:workshop
 */
public class Subscription implements SubscriptionInterface {
    public String title;
    public String email;
    public int cost;

    /** Constructor
     * @param title the title of a journal
     * @param email the email of someone in the journal
     * @param cost the cost of someone in the journal
     */
    public Subscription(String title, String email, int cost) {
        this.title = title;
        this.email = email;
        this.cost = cost;
    }

    /**
     * @return the title of a journal
     */
    @Override
    public String getTitle() {

        return title;
    }

    /**
     * @return the email of someone in the journal
     */
    @Override
    public String getEmail() {

        return email;
    }

    /**
     * @return the cost of someone in the journal
     */
    @Override
    public int getCost() {

        return cost;
    }
}
