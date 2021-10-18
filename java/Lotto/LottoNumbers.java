import java.util.Random;
import java.util.ArrayList;
/**
 * @author (Tomas Sabol)
 * @version (Oct 18, 2021)
 */
public class LottoNumbers
{
    private Random rnd = new Random();
    private ArrayList<Integer> euroJackpot;
    private ArrayList<Integer> vikingLotto;
    
    public LottoNumbers()
    {
        euroJackpot = new ArrayList<>();
    }
    
    public void euroJackpot(){
        System.out.print("EuroJackpot" + "\n");
        for (int i = 1; i < 6; i++){
            System.out.print(rnd.nextInt(51) + " ");
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Star numbers");
        for (int i = 1; i < 3; i++){
            System.out.print(rnd.nextInt(11) + " ");
        }
    }

    public void euroJackpotPlus(){
        while (euroJackpot.size() < 10){
            int rndInt = rnd.nextInt(51);
            if (euroJackpot.contains(rndInt)){
                System.out.println("generating new number");
            }
            else{
                euroJackpot.add(rndInt);
                System.out.println(euroJackpot);
            }
        }
        
        System.out.println("EuroJackpot: " + euroJackpot);
    }
    
    public void vikingLotto(){
        while (vikingLotto.size() < 6){
            int rndInt = rnd.nextInt(49);
            if (vikingLotto.contains(rndInt)){
                System.out.println("generating new number");
            }
            
            else{
                vikingLotto.add(rndInt);
                System.out.println(vikingLotto);
            }
        }  
        System.out.println("VikingLotto: " + vikingLotto);
    }
}
