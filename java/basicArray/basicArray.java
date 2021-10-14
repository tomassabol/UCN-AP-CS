
/**
 * Write a description of class basicArray here.
 *
 * @author (Tomas Sabol)
 * @version (Oct 14, 2021)
 */
public class basicArray
{
    double[] myArray = {
        Math.random(),
        Math.random(),
        Math.random(),
        Math.random()
    };
    
    public basicArray()
    {
        // 
    }
    
    public void printArray(){
        for (double element : myArray){
            System.out.println(element);
        }
    }
    
    public double getMaxValue(){
        double maxValue = 0;
        for (double element : myArray){
            if (element > maxValue){
                maxValue = element;
            }
        }
        return maxValue;
    }
    
    public double arrayAvg(){
        double sum = 0;
        double avg = 0;
        
        for (double element : myArray){
            sum += element;
        }
        
        avg = sum/myArray.length;
        return avg;
    }
    
    public void reverseArray(){
        for (int i=1; i>myArray.length; i++){
            System.out.println("Original array: " + myArray[i]);
        }
        
        for (int i=myArray.length-1; i>=0; i++){
            System.out.println("Reversed array: " + myArray[i]);
        }
    }

}
