package assignments.WS4;

/**This class implements AccountInterface and overrides the methods
 * in the interface. It has 5 variables and is the parent of
 * AccountStandard and AccountAdministrator.
 * It mainly describes the basic conditions that an account can be created.
 * And provides a number of methods to make its subclasses available
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/12
 * @Content:workshop
 */
public abstract class Account implements AccountInterface{
    private String name;
    private String salutation;
    private String email;
    private String password;
    public Boolean loggedIn;

    /**Constructor
     * @param name the name of the user
     * @param salutation the salutation of the user
     * @param email  the email of the user
     * @param password  the password of the account
     */
    public Account(String name, String salutation, String email, String password) {
        this.name = name;
        this.salutation = salutation;
        this.email = email;
        this.password = password;
        this.loggedIn=false;
    }


    /**
     * @param name set the name of the user
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * @param salutation set the salutation of the user
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /**
     * @param email set the email of the user
     */
    public void setEmail(String email) {

        this.email = email;
    }

    /**
     * @return a visual and formatted statement that can be printed to the console
     */
    @Override
    public String toString() {
        if (getLoggedIn() == true) {
            return "Account{" +
                    "name='" + name + '\'' +
                    ", salutation='" + salutation + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", loggedIn=" + loggedIn +
                    '}';
        }
        return "User needs to be logged in to use toString";
    }


    /**
     * Getter to check whether a user is logged in.
     * <p>
     * If the user is not loggedIn the toString method should be
     * disabled and only a warning should be printed that first a
     * login is necessary. Further methods may be disabled in
     * sub-classes.
     *
     * @return true if the user is looged in, false else.
     */
    @Override
    public boolean getLoggedIn() {
        System.out.println(loggedIn);
        if (loggedIn==false){
            System.out.println("You should login in first");
            return false;
        }
        else return true;
    }

    /**
     * setter for loggedIn
     *
     * @param loggedIn New value for the variable loggedIn
     */
    @Override
    public void setLoggedIn(boolean loggedIn) {
   this.loggedIn = loggedIn;
    }

    /**
     * The user is no longer logged in, that is, the
     * loggedIn variable set to false.
     */
    @Override
    public void logout() {
             this.loggedIn = false;
    }

    /**
     * Getter method to return the name of the user.
     *
     * @return The name of the user of the account.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Getter method to return the salutation of the account holder.
     *
     * @return The salutation of the account holder (e.g., "Mr", "Ms",
     * "Mrs", "Dr", "Prof")
     */
    @Override
    public String getSalutation() {

        return this.salutation;
    }

    /**
     * Getter method to return the email address of the account holder.
     *
     * @return The email address of the account holder.
     */
    @Override
    public String getEmail() {

        return this.email;
    }

    /**
     * Getter method to return the password.
     *
     * @return The password of the account.
     */
    @Override
    public String getPassword() {

        return this.password ;
    }

    /**
     * Setter for the password.
     *
     * @param password The new password.
     */
    @Override
    public void setPassword(String password) {
         this.password = password;
    }

    /**
     * Method to compare a provided password with the stored password.
     *
     * @param password The provided password to which the password of
     *                 the this object is compared.
     * @return true if the password of the account agrees with the
     * argument, false else.
     */
    @Override
    public boolean checkPassword(String password) {

       if (this.password==password){
           return true;
       }
       return false;
    }

    /**
     * Changes the password from old to new if the old password is
     * correct, else an error message is printed.
     *
     * @param oldPassword The current password.
     * @param newPassword The future password.
     */
    @Override
    public void changePassword(String oldPassword, String newPassword) {
      if (this.password!= oldPassword){
          System.out.println("Your old password is not correct");
      }
      else if (this.password==oldPassword){
          this.setPassword(newPassword);
      }
    }
}
