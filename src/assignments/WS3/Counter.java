package assignments.WS3;


/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/30
 * @Content:workshop
 */
/*import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * The class is used in order to interactively count a number of
 * persons/items in a room, storeroom, etc. A user is able to select
 * between five options:
 * <pre>
 * 1. add to the counter,
 * 2. subtract from the counter,
 * 3. show the counter,
 * 4. set the counter to a new value, and
 * 5. exit the program.
 * </pre>
 * @author Manfred Kerber and Alexandros Evangelidis
 * @version 2019-10-21
 */
/*public class Counter {
    /**
     * Pattern for the choice of input: either 1, 2, 3, 4, or 5
     */
   /* public static final Pattern p12345 = Pattern.compile("[12345]");

     * Field variable to store the value of the counter.

    private int counter;
    /**
     * The constructor initializes the counter as 0. Starts a scanner
     * to read from the command line, offering 5 choices for (add,
     * subtract, show counter, set counter, and exit). It stays in a
     * loop until the program is explicitly exited by entering 5.
     * It has no parameters.
     */
    /*public Counter(){
        this.counter = 0;
//System.in is like System.out, however, for input and not for output.
        Scanner s = new Scanner(System.in);
        /* can take value 1 (add)
         * 2 (subtract)
         * 3 (show counter)
         * 4 (set counter)
         * 5 (exit)
         */
       /* byte topChoice = 1; // Can be anything but 5 to enter the loop
        while (topChoice < 5) {
            System.out.println("Please enter:\n"+
                    "1 to add to the total\n" +
                    "2 to subtract from the total\n"+
                    "3 to show the total\n"+
                    "4 to set the total\n"+
                    "5 to exit the program");
            topChoice = (byte) Integer.parseInt(s.next(p12345));
            switch(topChoice) {
                case 1: add(s);
                case 2: subtract(s);
                case 3: show();
                case 4: set(s);
                case 5: System.out.println("Finally there are "
                        + counter + " items available.");
                default:System.out.println("Please enter:\n"+
                        "1 to add to the total\n" +
                        "2 to subtract from the total\n"+
                        "3 to show the total\n"+
                        "4 to set the total\n"+
                        "5 to exit the program");
            }
        }
    }
    /**
     * The method reads in a number from the input and adds it to the counter.
     * @param s The scanner from which the input is read.
     */
   /* public void add(Scanner s) {
        System.out.println("How much to add?");
        try {
            counter += Integer.parseInt(s.next());
        }
        catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);
        }
    }
    /**
     * The method reads in a number from the input and subtracts it
     * from the counter.
     * @param s The scanner from which the input is read.
     */
  /*  public void subtract(Scanner s) {
        System.out.println("How much to subtract?");
        try {
            counter -= Integer.parseInt(s.next());
        }
        catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);
        }
    }
    /**
     * The method prints the current value of the counter.
     */
   /* public void show() {
        System.out.println("Currently there are " + counter +
                " items available.");
    }
    /**
     * The method reads in a number from the input and sets the
     * counter to this value
     * @param s The scanner from which the input is read.
     */
    /*public void set(Scanner s) {
        System.out.println("To which value do you want to set the counter?");
        try {
            counter = Integer.parseInt(s.next());
        }
        catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);
        }
    }
    public static void main(String[] args) {
        Counter parcels = new Counter();
    }
}
*/


import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 *  The class is used in order to interactively count a number of
 *   persons/items in a room, storeroom, etc. A user is able to select
 *   between five options:
 *  1. add to the counter,
 *  2. subtract from the counter,
 *  3. show the counter,
 *  4. set the counter to a new value, and
 *   5. exit the program.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/2
 * @Content:workshop
 */
/*
I want to summarize here the vulnerabilities of the previous code.
I personally think that the input method and the methods to add, subtract,
set and show are not problems.The problem is in the constructor.
Before we run the program, after using the add method,
the program jumps directly to the subtraction method.
If we don't want to use subtraction, we can only enter 0 in the program.
So I refactored the constructor. In this case, the program can automatically
return to the initial position after calling the method once,
asking the user to select the desired method again.
Although it is temporarily impossible to keep the program on any page
the user wants to stay, the robustness of the program is much stronger
than before.
*/

public class Counter {
    public static final Pattern p12345 = Pattern.compile("[12345]");
    private int counter;

    /**
     * a no-parameter constructor
     * There are 5 different options available, and when the user enters a
     * different number from 1-5, they will go to a different next step.
     */
    public Counter(){
        this.counter = 0;
//System.in is like System.out, however, for input and not for output.
        Scanner s = new Scanner(System.in);
        /* can take value 1 (add)
         * 2 (subtract)
         * 3 (show counter)
         * 4 (set counter)
         * 5 (exit)
         */
        byte topChoice = 0; // Can be anything but 5 to enter the loop
        while (topChoice < 5) {
            System.out.println("Please enter:\n"+
                    "1 to add to the total\n" +
                    "2 to subtract from the total\n"+
                    "3 to show the total\n"+
                    "4 to set the total\n"+
                    "5 to exit the program");
            topChoice = (byte) Integer.parseInt(s.next(p12345));
            if (topChoice==1){
                add(s);
            }
            if (topChoice==2) {
                subtract(s);
            }
            if (topChoice==3) {
                show();
            }
            if (topChoice==4) {
                set(s);
            }if (topChoice==5) {
                System.out.println("Finally there are "
                        + counter + " items available.");
            }

        }
    }

    /**
     * @param s Get the number entered
     *   An add method, when the user selects this method,
     *   can add numbers to the background of the program.
     */
    public  void add(Scanner s) {
        System.out.println("How much to add?");
        try {
            counter += Integer.parseInt(s.next());
        }
        catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);
        }
    }
    /**
     * The method reads in a number from the input and subtracts it
     * from the counter.
     * @param s The scanner from which the input is read.
     */
    public void subtract(Scanner s) {
        System.out.println("How much to subtract?");
        try {
            counter -= Integer.parseInt(s.next());
        }
        catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);
        }
    }
    /**
     * The method prints the current value of the counter.
     */
    public void show() {
        System.out.println("Currently there are " + counter +
                " items available.");
    }
    /**
     * The method reads in a number from the input and sets the
     * counter to this value
     * @param s The scanner from which the input is read.
     */
    public void set(Scanner s) {
        System.out.println("To which value do you want to set the counter?");
        try {
            counter = Integer.parseInt(s.next());
        }
        catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);
        }
    }
    public static void main(String[] args) {

        Counter parcels = new Counter();
    }
}




