
/**
 * Write a description of class Dog here.
 *
 * @author Andrej Piecka
 * @version (a version number or a date)
 */
public class Dog {
    // instance variables
    private String name;
    private int year;

    /**
     * Constructor for objects of class Dog
     */
    public Dog(String name, int year) {
        this.name = name;
        this.year = year;
    }

    /**
     * An example of a method
     */
    public void setName(String name) {
    this.name = name;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public String getName() {
        return name;
    }
    
    public int getYear() {
        return year;
    }
    
    public void printInfo(){
        System.out.println(name);
        System.out.println(year);
    }
}
