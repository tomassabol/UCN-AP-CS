import java.util.ArrayList;
/**
 * Write a description of class OrderLine here.
 * 
 * @author Mogens Holm Iversen 
 * @version 0.1.0 Initial draft
 */

public class OrderLine{
    private int quantity;
    private Product product;// is connected to one product
    // private ArrayList<Product> myProducts;

 
    public OrderLine(int newQuantity, Product newProduct) {
       quantity = newQuantity;
       product = newProduct;
    }
    
    public void printInfo() {
        // insert code to print product info and quantity
        System.out.println(quantity);
        product.printInfo();
    }
    
    public double getOrderLinePrice(){
        return product.getPrice() * quantity;    
    }
}
