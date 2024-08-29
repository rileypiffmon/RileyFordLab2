package edu.westga.cs1302.lab1.test.bill;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class TestAddItem {

	@Test
	void testItemIsNotNull() {
		Bill testBill = new Bill();
		assertThrows(IllegalArgumentException.class, () -> {
			testBill.addItem(null);
		});
	}
	
	@Test
	void testItemIsAddedToList() {
		Bill testBill = new Bill();
		BillItem testItem = new BillItem("Test", 80);
		testBill.addItem(testItem);
		ArrayList<BillItem> items = new ArrayList<BillItem>();
		items = testBill.getList();
		assertEquals(testItem, items.get(0));
	}
	
	@Test
	void testItemIsAddedToListInOrder() {
		Bill testBill = new Bill();
		BillItem testItem = new BillItem("Test", 80);
		BillItem testItem2 = new BillItem("Test 2", 81);
		BillItem testItem3 = new BillItem("Test 2", 82);
		testBill.addItem(testItem);
		testBill.addItem(testItem2);
		testBill.addItem(testItem3);
		ArrayList<BillItem> items = new ArrayList<BillItem>();
		items = testBill.getList();
		assertEquals(testItem2, items.get(1));
		assertEquals(testItem3, items.get(2));
	}
}
