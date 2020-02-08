package sample;

/**
        * @Version 1.0
        * @Author:Mingrui Li 2087184 mxl991
        * @Date:2019/11/28
        * @Content:workshop
        *This class is a base class and is
 *         mainly used for description and a getter and setter method.
Write this class to instantiate the array of expenses in the other two classes
        */
public class Expenditure {
	private String description;
	private int value;

	/**
	 * @param desp  the description of a item
	 * @param n the value/number of the Expenditure of the item
	 */
	public Expenditure(String desp, int n) {
		description = desp;
		value = n;
	}

	/**
	 * @return the description of the item
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the value/number of the Expenditure of the item
	 */
	public int getValue() {

	    return value;
	}
}
