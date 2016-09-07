package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's email in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidEmail(String)}
 */
public abstract class Contact {
	public final String value;
    private boolean isPrivate;
    /**
     * Validates given email.
     *
     * @throws IllegalValueException if given contact address string is invalid.
     */
    
    public Contact(String contact, boolean isPrivate) {
        this.isPrivate = isPrivate;
        contact = contact.trim();
        this.value = contact;
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
