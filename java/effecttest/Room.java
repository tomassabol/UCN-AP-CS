import java.util.ArrayList;
/**
 * Write a description of class Room here.
 *
 * @author (Tomas Sabol)
 * @version (Oct 14, 2021)
 */
public class Room
{
    private String name;
    private int capacity;
    private ArrayList<Attendee> attendees;
    private ArrayList<Attendee> expAttendees;
    
    public Room(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
        attendees = new ArrayList<>();
        expAttendees = new ArrayList<>();
    }
    
    // get
    public String getName(){
        return name;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    // set
    public String setName(String name){
        this.name = name;
        return name;
    }

    public int setCapacity(int capacity){
        this.capacity = capacity;
        return capacity;
    }
    
    // other methods
    public void addAttendee(Attendee attendee){
        if (attendees.size() < capacity){
            attendees.add(attendee);
            System.out.println(attendees.size());
        }
        else{
            System.out.println("Class is already full, can't add more attendees");
        }
    }
    
    public void printClassInfo(){
        System.out.println("Class name" + name);
        System.out.println("Class capacity" + capacity);
        System.out.println("Current number of attendees" + attendees.size());
        System.out.println("");
        for (Attendee attendee : attendees){
            attendee.printAttendeeInfo();
            System.out.println("");
        }
    }
    
    public int getClassExperience(){
        int classExperience = 0;
        for (Attendee attendee : attendees){
            classExperience += attendee.getExperience();
        }
        return classExperience;
    }
    
    public void highestExperience(){
        int maxExperience = 0;
        String maxExpName;
        
        for (Attendee attendee : attendees){
            int currentExp = attendee.getExperience();
            if (maxExperience < currentExp){
                maxExperience = currentExp;
                maxExpName = attendee.getName();
                System.out.println(maxExpName);
            }
        }
    }
    
    public void experienceRange(int value1, int value2){
        for (Attendee attendee : attendees){
            if ((value1 < attendee.getExperience()) && (attendee.getExperience() < value2)){
                expAttendees.add(attendee);
            }
            System.out.println(expAttendees);
        } 
    }
    
    
    
}
