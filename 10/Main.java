import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String firstString = input.nextLine();
        String secondString = input.nextLine();
        
        int firstLength = firstString.length();
        int secondLength = secondString.length();
        
        int max = 0;
        String result = "";
        
        if (firstLength >= secondLength) max = firstLength;
        else max = secondLength;
        
        for(int i = 0; i < max; i++) {
            if ( (i + 1) > secondLength ) {
                result += firstString.substring(i,firstLength);
                break;
            }
             else if ( (i + 1) > firstLength ) {
                result += secondString.substring(i,secondLength);
                break;
            } else {
                result += secondString.substring(i, i+1);
                result += firstString.substring(i,i+1);
            }
        }
        
        System.out.println(result);
        
    }
}
