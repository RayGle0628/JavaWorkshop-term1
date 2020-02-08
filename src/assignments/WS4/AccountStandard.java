package assignments.WS4;

import java.util.ArrayList;

/**
 * This class is used to write the functions of a standard user's account,
 * including login, setting balance, and so on. It also verifies that
 * the user's password is correct, and if not, blocks the login.
 * If the failure is more than three times, the account will be blocked.
 * It implements AccountStandardInterface and inherits the Account class.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/12
 * @Content:workshop
 */
public class AccountStandard extends Account implements AccountStandardInterface {
    private int balance;
    private ArrayList<MusicTitle> titleBought =new ArrayList<MusicTitle>();
    private int failedLoginAttemps=0;
    public static final int MAXIMAL_LOGIN_ATTEMPTS =3;

    /**Constructor
     * @param name the name of the user
     * @param salutation the salutation of the user
     * @param email  the email of the user
     * @param password  the password of the account
     */
    public AccountStandard(String name, String salutation, String email, String password) {
        super(name, salutation, email, password);
    }

    /**
     * Getter method to return the balance.
     *
     * @return The balance of the account.
     */
    @Override
    public int getBalance() {
        return this.balance;
    }

    /**
     * Getter method to return the list of all titles bought by the user.
     *
     * @return The current list of titles bought by the user.
     */
    @Override
    public ArrayList<MusicTitle> getTitlesBought() {

        return this.titleBought;
    }

    /**
     * Adds the amount - if positive - to the current balance. For
     * non-positive amounts the action does nothing.
     *
     * @param amount The amount being deposited.
     */
    @Override
    public void deposit(int amount) {
   if (amount>=0){
       balance = balance+amount;
   }
   else balance = balance+0;
    }

    /**
     * Setter for the balance.
     *
     * @param balance The new balance of the account.
     */
    @Override
    public void setBalance(int balance) {

        this.balance = balance;
    }

    /**
     * Getter method to return the number of failed login attempts.
     *
     * @return The number of failed login attempts.
     */
    @Override
    public int getFailedLoginAttempts () {
       return failedLoginAttemps;
    }

    /**
     * Setter for the failed login attempts.
     *
     * @param failedLoginAttempts The new number of failed login attempts.
     */
    @Override
    public void setFailedLoginAttempts(int failedLoginAttempts) {
    this.failedLoginAttemps = failedLoginAttempts;
    }

    /**
     * If the user is logged in and has sufficient funds, a music
     * title is bought by adding the title to the ArrayList of
     * titlesBought of the customer. Furthermore the price of the
     * title is subtracted from the funds of the customer. If the
     * user is not logged in, a corresponding warning is to be
     * printed. Likewise if the user has insufficient funds, they
     * should be asked to pay money into their account.
     *
     * @param musicTitle The music title that the customer wants to
     *                   buy.
     */
    @Override
    public void buy(MusicTitle musicTitle) {
   if (getLoggedIn()==false){
       System.out.println("You should login in first");
   }
   else  if (getLoggedIn()==true){
          if (this.getBalance()>=musicTitle.getPrice()) {
              this.titleBought.add(musicTitle);
              this.balance = balance - musicTitle.getPrice();
          }
          else  if (this.getBalance()<musicTitle.getPrice()){
              System.out.println("Your balance is not enough,you should pay " +
                      "money into your account first!");
          }
   }
    }

    /**
     * We require in each sub-class the existence of a login method.
     *
     * @param password The password provided that will be compared to
     *                 the password stored on the system, i.e., the value of the
     *                 field variable. If the password provided is correct, the field
     *                 variable loggedIn is changes to true, else a warning is to be
     *                 printed.
     */
    @Override
    public void login(String password) {
   if (this.getPassword()==password){
      this.setLoggedIn(true);
      failedLoginAttemps = 0;
   } else {
       System.out.println("Your password is not correct");
       failedLoginAttemps++;
   }
    }

}
