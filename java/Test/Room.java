import java.util.ArrayList;
public class Room
{
    private String name;
    private int capacity;
    private ArrayList<Attendee> attendees;
    
    public Room(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
        attendees = new ArrayList<>();
    }
    
    // get
    public String getName(){
        return name;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    //set
    public String setName(String name){
        this.name = name;
        return name;
    }
    
    public int setCapacity(int capacity){
        this.capacity = capacity;
        return capacity;
    }
    
    public void addAttendee(Attendee attendee){
        if (attendees.size() >= capacity){
            System.out.println("Cant add more attendees to the class. Room is full");
            System.out.println(attendees.size());
        }
        else{
            attendees.add(attendee);
            System.out.println(attendees.size());
        }
    }
    
    public void printRoomInfo(){
        System.out.println("class name: " + name);
        System.out.println("class capacity " + capacity);
        System.out.println("Attendees in class: " + attendees.size());
        for (Attendee attendee : attendees){
            attendee.printAttendeeInfo();
        }
    }
    
    public int getTotalExperience(){
        int experience = 0;
        for (Attendee attendee: attendees){
            experience += attendee.getExperience();
        }
        return experience;
    }
    
    public void printExperienceGreaterThan(int expValue){
        for (Attendee attendee : attendees){
            if (attendee.getExperience() > expValue){
                System.out.println(attendee.getName());
            }
        }
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
    
    
}
