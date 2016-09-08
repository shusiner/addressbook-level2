package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
	
	private Name testName;
	
	@Before
	public void setup() throws IllegalValueException {
		testName = new Name("Obama");
	}
	
	@Test
	public void nullInput_returnsFalse(){
		//null name entered
		assertFalse(testName.isSimilar(null));
	}

}
