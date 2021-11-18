
/**
 * @author tomassabol
 * @version Nov 18, 2021
 */
public class Recursion
{
    
    public Recursion(){}
    
    public static void main(String args[]){
        Recursion tester = new Recursion();
        long startTime = System.currentTimeMillis();
        tester.countDown(10000);
        long endTime = System.currentTimeMillis();
        System.out.println("Guesttime of running time: " + (endTime - startTime));
    }

    private void countDown(int from){
        System.out.println(from);
        while (from>=0){
            System.out.println(from--);
        }
    }
}
