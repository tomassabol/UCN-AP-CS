import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class StuffOrganizer here.
 *
 * @author (Tomas Sabol)
 * @version (Oct 14, 2021)
 */
public class StuffOrganizer
{
    
    private ArrayList<Stuff> stuffs;
    
    public StuffOrganizer()
    {
        stuffs = new ArrayList<>(); 
    }
    
    public void addStuff(Stuff stuff){
        stuffs.add(stuff);
        System.out.println(stuffs.size());
    }
    
    public ArrayList getAllStuff(){
        return stuffs;
    }
    
    public boolean removeStuff(Stuff stuff){
        this.stuffs.remove(stuff);
        return true;
    }
    
    public Stuff removeStuffByName(String name){
        Iterator<Stuff> it = stuffs.iterator();
        Stuff removed = null;
        
        while (it.hasNext()) {
            Stuff thisStuff = it.next();
            if (thisStuff.getName().equals(name)) {
                removeStuff(thisStuff);
                removed = thisStuff;
            }
        }
        return removed;
    }
    
    public Stuff findByName(String name){
        Stuff found = null;
        
        for (Stuff element : stuffs){
            if (element.getName().equals(name)){
                found = element;
            }
        }
        
        return found;
    
    }

}
