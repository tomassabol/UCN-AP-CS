package controller;
import model.*;

/**
 * @author tomassabol
 *
 */
public class PersonController {
	PersonContainer pCon;
	
	public PersonController() {
		pCon = PersonContainer.getInstance();
	}
	
	/**
	 * Creates a person
	 * @param name
	 * @param address
	 * @param email
	 */
	public void createPerson(String name, String address, String email) {
		Person person = new Person(name, address, email);
		pCon.addPerson(person);
	}
	
	/**
	 * Prints out all the Persons
	 */
	public void printAllPerson() {
		pCon.printAllPerson();
	}
}
