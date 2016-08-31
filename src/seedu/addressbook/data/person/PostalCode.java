package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
	public static final String EXAMPLE = "231534";
    public static final String POSTALCODE_BLOCK_CONSTRAINTS = "Postal code can be in any format";
    public static final String BLOCK_VALIDATION_REGEX = ".+";
    
    public final String value;
    private boolean isPrivate;

    /**
     * Validates given block.
     *
     * @throws IllegalValueException if given block string is invalid.
     */
    public PostalCode(String postalCode, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidPostalCode(postalCode)) {
            throw new IllegalValueException(POSTALCODE_BLOCK_CONSTRAINTS);
        }
        this.value = postalCode;
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidPostalCode(String test) {
        return test.matches(BLOCK_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.value.equals(((PostalCode) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
}
