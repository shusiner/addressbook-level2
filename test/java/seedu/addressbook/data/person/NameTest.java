package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
	
	private Name testName;
	private Name testName2;
	
	@Before
	public void setup() throws IllegalValueException {
		testName = new Name("Obama");
		testName2 = new Name("obama");
	}
	
	@Test
	public void nullInput_returnsFalse(){
		//null name entered
		assertFalse(testName.isSimilar(null));
	}
	
	@Test
	public void diffCap_returnsTrue(){
		assertTrue(testName.isSimilar(testName2));
	}

}
