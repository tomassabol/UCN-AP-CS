/**
 * 
 */
package ui;
import java.util.Scanner;
import controller.PersonController;

/**
 * @author ttomy
 *
 */
public class TryMe {
	
	private PersonController pCtr;
	
	/**
	 * Constructor for TryMe class
	 */
	public TryMe() {
		pCtr = new PersonController();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TryMe tryMe = new TryMe();
		tryMe.start();
	}
	
	public void start() {
		boolean exit = false;
		while(!exit) {
			int choice = menu();
			if(choice == 1) {
				createPerson();
			}
			else if(choice == 2) {
				printPersons();
			}
			else {
				exit = true;
			}
		}
	}
	
	public int menu() {
		int choice = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("*** Menu ***");
		System.out.println(" (1) Create Person");
		System.out.println(" (2) List Persons");
		System.out.println(" (3) Exit");
		System.out.print("\n Write a number: ");
		
		while(!keyboard.hasNextInt()) {
			System.out.println("You must write a valid number - try again");
			keyboard.nextLine();
		}
		choice = keyboard.nextInt();
		return choice;
	}
	
	/**
	 * 
	 * @return the name the user put in
	 */
	public String inputName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input name: ");
		String name = keyboard.nextLine();
		return name;
	}
	
	/**
	 * 
	 * @return the address the user put in
	 */
	public String inputAddress() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input address: ");
		String address = keyboard.nextLine();
		return address;
	}
	
	/**
	 * 
	 * @return the email the user put in
	 */
	public String inputEmail() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input email: ");
		String email = keyboard.nextLine();
		return email;
	}
	
	/**
	 * Creates a person
	 * @param name
	 * @param address
	 * @param email
	 */
	public void createPerson() {
		String name = inputName();
		String address = inputAddress();
		String email = inputEmail();
		pCtr.createPerson(name, address, email);
	}
	
	/**
	 * Prints out all the Persons
	 */
	public void printPersons() {
		pCtr.printAllPerson();
	}

}
