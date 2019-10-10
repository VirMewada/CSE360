//Name of the author - Virbhadra Mewada 
//class ID - 1213379438
//assignment number - 2
//
//Description - Uses JavaDoc

package cse360assign2;

/**
 * @author Vir
 *
 */
public class AddingMachine {

	private int total;
	private String answer ;
	

	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		answer = String.valueOf(total);
	}
	/**
	 * @Description
	 * AddingMachine has an attribute total(int) and methods getTotal (),add (value), subtract (value),String toString (),clear().
	 * @Attribute total
	 * @constructor  AddingMachine ()
	 * @methods getTotal (),add (value),subtract (value),String toString (),clear().
	 */
	
	public int getTotal () {
		return this.total;
	}
	/**
	 * @Description This method returns the total amount.
	 * @return total
	 */

	public void add (int value) {
		this.total += value;
		answer += " + " + value;
	}
	/**
	 * @Description This function adds 'value' to 'total'.
	 * @param value
	 */

	public void subtract (int value) {
		this.total -= value;
		answer += " - " + value;
	}
	/**
	 * @Description This function subtracts 'value' from 'total'.
	 * @param value
	 */

	public String toString () {
		
		return answer;
	}
	/**
	 * @Description This function is used to return the string 
	 * @return String
	 */

	public void clear() {
		total = 0;
		answer = "0";
	}
	/**
	 * @Description This function assigns 0 to total
	 */

}