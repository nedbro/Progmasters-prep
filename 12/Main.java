import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int ones = 0;
        int fours = 0;
        
        for(int i = 0; i < size; i++) {
            int x = input.nextInt();
            
            if(x == 1) ones++;
            else if (x == 4) fours++;
            
        }
        
        if(ones < fours) System.out.println("true");
        else System.out.println("false");
        
    }
}
