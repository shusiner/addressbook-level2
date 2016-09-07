package seedu.addressbook.data.tag;

import java.util.*;
import seedu.addressbook.data.person.Person;

public class Tagging {
	private Tag tag;
	private boolean addOrDelete;
	private List<Tagging> taggings;
	private Person person;
	
	/**
	 * Construct a tagging
	 * add is true and delete is false
	 */
	public Tagging(Person person, Tag tag, boolean addOrDelete) {
		this.person = person;
		this.tag = tag;
		this.addOrDelete = addOrDelete;
	}
	
	public List<Tagging> getTaggings() {
		return taggings;
	}
	
	public List<String> toStringTaggings() {
		List<String> taggingsString = new ArrayList<String>();
		for(Tagging tagging : this.getTaggings()) {
			String name = tagging.getPerson().getName().toString();
			String tag = tagging.getTag().toString();
			String addOrDelete = (tagging.getAddorDelete()) ? "+" : "-";
			taggingsString.add(addOrDelete+" "+name+" "+"["+tag+"]");
		}
		return taggingsString;
		
	}

	private Person getPerson() {
		return this.person;
	}
	
	private Tag getTag() {
		return this.tag;
	}
	
	private boolean getAddorDelete() {
		return this.addOrDelete;
	}
}
