package assignments.WS4;

import java.util.ArrayList;

/**This class is created for the account management service of the administrator.
 It implements the AccountAdministratorInterface and inherits from the Account
 class. It has the ability to reset passwords, add accounts, and more.
 This class is indispensable for this kind of similar login system,
 and it provides the right authority for the right administrator.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/12
 * @Content:workshop
 */
public class AccountAdministrator extends Account implements AccountAdministratorInterface {
    private ArrayList<Account> accounts = new ArrayList<>();

    /**Constructor
     * @param name the name of the user
     * @param salutation the salutation of the user
     * @param email  the email of the user
     * @param password  the password of the account
     */
    public AccountAdministrator(String name, String salutation, String email, String password) {
        super(name, salutation, email, password);

    }

    /**
     * Getter method to return the list of accounts the administrator
     * looks after.
     *
     * @return The list of accounts the administrator looks after.
     */
    @Override
    public ArrayList<Account> getAccounts() {

        return this.accounts;
    }

    /**
     * The method adds an account to the list of accounts the
     * administrator looks after.
     *
     * @param account
     */
    @Override
    public void addAccount(Account account) {

        accounts.add(account);
    }

    /**
     * If an account can no longer be used, since either the user has
     * forgotten their password or in case of a standard user has
     * entered the password incorrectly too often the administrator
     * can reset the account by setting a new password and resetting
     * the number of failed login attempts to zero (the latter only
     * if the account is a standard account).
     *
     * @param account  The account that is to be reset.
     * @param password The new password for the account that is to be
     */
    @Override
    public void resetAccount(Account account, String password) {

        if (getLoggedIn() == true) {
            account.setPassword(password);
            if (account instanceof AccountStandard)
                ((AccountStandard) account).setFailedLoginAttempts(0);

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
        }else System.out.println("Your password is not correct");
    }

}
