import java.util.HashMap;
/**
 * Write a description of class Main here.
 *
 * @author (Tomas Sabol)
 * @version (Oct 15, 2021)
 */
public class Main
{
    private HashMap<String, String> book;
    
    public Main()
    {
        book = new HashMap<>();
    }

    public void addPerson(String name, String phone){
        book.put(name, phone);
    }
    
    public void findPerson(String name){}
    //unfinished
    
    public void name(){
        String phoneNum1 = new String("+451");
        String phoneNum2 = new String("+452");
        String phoneNum3 = new String("+453");
        String phoneNum4 = new String("+454");
        
        HashMap<String, String> map = new HashMap<>();
        
        map.put("Banana Joe", phoneNum1);
        map.put("Bud Spencer", phoneNum2);
        map.put("Cotton eyed Joe", phoneNum3);
        map.put("sicpack", phoneNum4);
        
        System.out.println(map);
        
    }
}