import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String text = input.nextLine();
        int start = input.nextInt();
        int end = input.nextInt();
        
        String substring = text.substring(start,end);
        System.out.println(substring);
    }
}
