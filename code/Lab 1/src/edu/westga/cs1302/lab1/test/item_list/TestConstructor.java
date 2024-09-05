package edu.westga.cs1302.lab1.test.item_list;

import static org.junit.Assert.assertThrows;
import org.junit.Test;
import edu.westga.cs1302.lab1.view.ItemList;

public class TestConstructor {
	
	@Test
	public void testBillIsNotVoid() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ItemList(null);
		});
	}

}
