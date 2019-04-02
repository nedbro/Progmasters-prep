import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int number = input.nextInt();
        
        int textLength = text.length();
        String textSubString = text.substring(textLength - number , textLength);
        
        String output = "";
        
        for(int i = 0; i <= number; i++) {
            output += textSubString;
        }
        
        System.out.println(output);
    }
}
