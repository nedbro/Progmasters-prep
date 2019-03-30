import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        
        for( int i = 0; i < arraySize; i++ ) {
            int x = input.nextInt();
            array[i] = x;
        }
        
        for( int i = 0; i < arraySize; i++) {
            System.out.println(array[i]);
        }
    } 
}
