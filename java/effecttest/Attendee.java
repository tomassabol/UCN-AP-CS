
/**
 * Write a description of class Attendee here.
 *
 * @author (Tomas Sabol)
 * @version (Oct 14, 2021)
 */
public class Attendee
{
    private String name;
    private int experience;
    
    public Attendee(String name, int experience)
    {
        this.name = name;
        this.experience = experience;
    }
    
    // get
    public String getName(){
        return name;
    }
    
    public int getExperience(){
        return experience;
    }
    
    // set
    public String setName(String name){
        this.name = name;
        return name;
    }
    
    public int setExperience(int experience){
        this.experience = experience;
        return experience;
    }
    
    
    // print info
    public void printAttendeeInfo(){
        System.out.println(name);
        System.out.println(experience);
    }    
}
