import java.util.ArrayList;
/**
 * Write a description of class Customer here.
 * 
 * @author Mogens Holm Iversen 
 * @version 0.1.0 Initial draft
 */
public class Customer {
    // instance variables - replace the example below with your own
    private int number;
    private String name;
    private String address;
    private String phone;
    //private Order myOrder;//at the moment only one instance of order
    private ArrayList<Order> myOrders;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int number, String name, String address, String phone) {
       this.number = number;
       this.address = address;
       this.name = name;
       this.phone = phone;
       myOrders = new ArrayList<>();
    }

    public void addOrder(Order myOrder) {
        myOrders.add(myOrder);
        for (Order order : myOrders){
            order.printInfo();
        }
    }
    
    public void printInfo() {
        System.out.println("Customer no.:  " + number);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone#: " + phone);
        System.out.println("My order info: " + myOrders);
    }
}
