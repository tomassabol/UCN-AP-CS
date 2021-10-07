import java.util.ArrayList;
/**
 * Write a description of class Product here.
 * 
 * @author Mogens Holm Iversen 
 * @version 0.1.0 Initial draft
 */
 
public class Product {
    // instance variables 
    private String barCode;
    private String description;
    private double price;
    private int quantityInStock;
    

    /**
     * Constructor for objects of class Product
     */
    public Product(String newId, String newDescription, double newPrice, int newStock) {
        barCode = newId;
        description = newDescription;
        price = newPrice;
        quantityInStock = newStock;
      
    }
    
    public double getPrice(){
        return price;
    }
    
    public void printInfo() {
        // print product info
        System.out.println(barCode);
        System.out.println(description);
        System.out.println(price);
        System.out.println(quantityInStock);
    }
    
}
