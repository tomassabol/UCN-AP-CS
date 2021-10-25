package model;
import java.util.ArrayList;

/**
 * @author tomassabol
 *
 */
public class PersonContainer {
	private ArrayList<Person> persons;
    private static PersonContainer instance;

    /**
     * Constructor for objects of class PersonContainer
     */
    private PersonContainer()
    {
        persons = new ArrayList<>();
    }
    
    public static PersonContainer getInstance(){
        if(instance == null){
            PersonContainer.instance = new PersonContainer();
        }
        return instance;
    }
    
    public void addPerson(Person person){
        persons.add(person);
    }
    
    public void printAllPerson() {
    	for(Person person: persons) {
    		person.printInfo();
    	}
    }
}
