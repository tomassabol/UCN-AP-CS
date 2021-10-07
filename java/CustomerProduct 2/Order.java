import java.util.ArrayList;
/**
 * Write a description of class Order here.
 * 
 * @author Mogens Holm Iversen 
 * @version 0.1.0 Initial draft
 */
public class Order {
    private int number;
    private String orderDate;
    private String deliveryDate;
    private String payDate;
    private boolean isShipped;
    // private OrderLine myOrderLine;// at the moment only one partorder pr. order
    private ArrayList<OrderLine> myOrderLines;

    /**
     * Constructor for objects of class Order
     */
    public Order(int newNr, String date, String newDelivery) {
        number = newNr;
        orderDate = date;
        deliveryDate = newDelivery;
        payDate = null;
        isShipped = false;
        myOrderLines = new ArrayList<>();
    }
    
    public void setPartOrder(OrderLine newOrderLine) {
        myOrderLines.add(newOrderLine);
        for (OrderLine myOrderLine : myOrderLines){
            myOrderLine.printInfo();
        }
    }
    
    public void printInfo() {
        for (OrderLine myOrderLine : myOrderLines){
            myOrderLine.printInfo();
        }
        //System.out.println("Order info: " + myOrderLines);
    }
    
    public double getOrderLinePrice(){
        double price = 0;
        for (OrderLine orderLine: myOrderLines){
            price += getOrderLinePrice();
        }
        return price;
    }
    
}
