
/**
 * @author (Tomas Sabol)
 * @version (Oct 15, 2021)
 */
public class Main
{
    
    public Main()
    {
        // 
    }
    
    public void multiply(){
        for (int i=1; i<11; i++){
            System.out.println(i*7);
        }
    }
    
    public void printChart(){
        for (int i=1; i<11; i++){
            System.out.print("\t" + i);
        }
        System.out.println("\n");
        System.out.println("-----------------------------------------------------------------------------------");
        
        for (int i=1; i<11; i++){
            System.out.print(i + "|");
            
            for (int j=1; j<11; j++){
                System.out.print("\t" + i*j);
                if (j == 10){
                    System.out.print("\n");
                }
            }
        }
    }

}
