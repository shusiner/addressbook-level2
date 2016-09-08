package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void isAnyNull_returnsTrue() {
		boolean result = Utils.isAnyNull(111,"aaa",null);
		assertEquals(result,true);
	}
	
	@Test
	public void isAnyNull_returnsFalse() {
		boolean result = Utils.isAnyNull(111,"aaa","bbb");
		assertEquals(result,false);
	}
	
	@Test
	public void elementsAreUnique_returnsTrue() {
		ArrayList<String> elements = new ArrayList<String>();
		elements.add("a");
		elements.add("b");
		boolean result = Utils.elementsAreUnique(elements);
		assertEquals(result,true);
	}
	
	@Test
	public void elementsAreUnique_returnsFalse() {
		ArrayList<String> elements = new ArrayList<String>();
		elements.add("a");
		elements.add("a");
		boolean result = Utils.elementsAreUnique(elements);
		assertEquals(result,false);
	}
}
