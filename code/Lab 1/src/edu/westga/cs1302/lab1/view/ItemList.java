package edu.westga.cs1302.lab1.view;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;
import java.util.ArrayList;

/** Stores information to show an entire bill to the user
 * 
 *  @author CS 1302
 *  @version Fall 2024
 * 
 */
public class ItemList {
	private Bill bill;
	private String text;
	private double subTotal = 0.0;
	private ArrayList<BillItem> listOfItems;
	
	/** Creates a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param bill the bill the list will be for
	 */
	public ItemList(Bill bill) {
		bill = this.bill;
		this.text = "ITEMS" + System.lineSeparator();
		this.subTotal = 0.0;
		this.listOfItems = bill.getList();
		this.addItemsToList();
		this.addSubTotalToList();
	}
	
	private void addItemsToList() {
		for (BillItem item : this.listOfItems) {
			this.text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			this.subTotal += item.getAmount();
		}
	}
	
	private void addSubTotalToList() {
		this.text += System.lineSeparator();
		this.text += "SUBTOTAL - $" + this.subTotal + System.lineSeparator();
		double tax = this.subTotal * 0.1;
		double tip = this.subTotal * 0.2;
		this.text += "TAX - $" + tax + System.lineSeparator();
		this.text += "TIP - $" + tip + System.lineSeparator();
		this.text += "TOTAL - $" + (this.subTotal + tip + tax);
	}
	
	/** Gets the text of the bill
	 * 
	 * @precondition text != null;
	 * @postcondition none
	 * 
	 * @return this.text the bill's text
	 */
	public String getText() {
		return this.text;
	}

 }

