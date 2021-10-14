
/**
 * Write a description of class Class here.
 *
 * @author (Tomas Sabol)
 * @version (Oct 14, 2021)
 */
public class Stuff
{
    private String name;
    private double price;
    private int count;
    
    public Stuff(String name, double price, int count)
    {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    
    // get
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
    
    public int getCount(){
        return count;
    }
    
    public double setPrice(double price){
        this.price = price;
        return price;
    }
    
    public int setCount(int count){
        this.count = count;
        return count;
    }
}
