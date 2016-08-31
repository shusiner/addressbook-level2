package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
	
	public static final String EXAMPLE = "#12-34";
    public static final String UNIT_BLOCK_CONSTRAINTS = "unit can be in any format";
    public static final String UNIT_VALIDATION_REGEX = ".+";
    
    public final String value;
    private boolean isPrivate;

    /**
     * Validates given block.
     *
     * @throws IllegalValueException if given unit string is invalid.
     */
    public Unit(String unit, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidBlock(unit)) {
            throw new IllegalValueException(UNIT_BLOCK_CONSTRAINTS);
        }
        this.value = unit;
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.value.equals(((Unit) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
}
