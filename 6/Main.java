import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        
        String[] wordArray = word.split("");
        String[] wordArrayBackwards = new String[wordArray.length];
        
        int helper = 0;
        for(int i = (wordArray.length - 1); i > -1; i--){
            wordArrayBackwards[helper] = wordArray[i];
            helper++;
        }
        
        if( Arrays.equals( wordArray, wordArrayBackwards ) ) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
