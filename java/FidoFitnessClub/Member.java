import java.util.ArrayList;
/**
 * Write a description of class Member here.
 *
 * @author Andrej Piecka
 * @version (a version number or a date)
 */
public class Member {
    // instance variables
    private String name;
    private String phoneNumber;
    private String email;
    private ArrayList<Dog> dogs;
    private Dog dog;
    private boolean isFeeDue;

    /**
     * Constructor for objects of class Member
     */
    public Member(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dogs = new ArrayList<>();
    }


    public boolean isFeeDue(Dog dog) {
        if (isFeeDue != false){
            isFeeDue = false;
        }
        return isFeeDue;
    }
    
    public boolean payFee(Dog dog){
        isFeeDue = false;
        return isFeeDue;
    }
    
    public boolean hasDog() {
        boolean value = false; 
        if (dog != null) {
            value = true; 
        }
        return value;
    }
    
    public void describe() {
        System.out.println("Member name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("email: " + email);
        if (dog != null) {
            System.out.println("Dog name: " + dog.getName());
        } 
        else {
            System.out.println("No dog");
        }
    }
    
    public void addDog(Dog dog){
        this.dogs.add(dog);
    }
    
    public void getDogs(){
        System.out.println(dogs);
    }
    
    public void getDogsInfo(){
        for (Dog dog : dogs){
            dog.printInfo();
        }
    }
    
    public void removeDog(Dog dog){
        dogs.remove(dog);    
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
}
