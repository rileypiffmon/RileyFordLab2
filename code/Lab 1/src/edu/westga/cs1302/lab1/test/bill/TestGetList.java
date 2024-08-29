package edu.westga.cs1302.lab1.test.bill;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class TestGetList {

	@Test
	void testThatListIsReturned() {
		Bill testBill = new Bill();
		BillItem testItem = new BillItem("Test", 80);
		testBill.addItem(testItem);
		ArrayList<BillItem> expected = new ArrayList<BillItem>();
		expected.add(testItem);
		assertEquals(expected, testBill.getList());
		}
}
