package edu.westga.cs1302.lab1.test.bill_item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import edu.westga.cs1302.lab1.model.BillItem;

public class TestConstructor {
	
	@Test
	public void testNameIsNotNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem(null, 22.0);
		});
	}
	
	@Test
	public void testAmountIsGreaterThanZero() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem("Text", 0.0);
		});
	}
	
	@Test
	public void testParametersAreSavedCorrectly() {
		BillItem test = new BillItem("Cookie", 450.0);
		assertEquals("Cookie", test.getName());
		assertEquals(450.0, test.getAmount(), 0);
	}

}
