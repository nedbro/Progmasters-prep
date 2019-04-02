import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        
        int threeCounter = 0;
        
        for(int i = 0; i < arraySize; i++) {
            array[i] = input.nextInt();
            if(array[i] == 3) threeCounter++;
        }
        
        if(threeCounter != 3) {
            System.out.println("true");
        }
        else {
            int[] locations = new int[3];
            
            int helper = 0;
            
            for(int i = 0; i < arraySize; i++){
                
                if(array[i] == 3){
                    locations[helper] = i;
                    helper++;
                }
            }
            
            if((locations[1] - locations[0] > 1) && (locations[2] - locations[1] > 1)) {
                System.out.println("false");
            } else System.out.println("true");
            
        }
        
    }
}
