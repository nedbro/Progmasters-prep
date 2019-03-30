import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[][] array = new int[6][6];
        
        for( int i = 0; i < 6; i++ ) {
            for( int j = 0; j < 6; j++){
                int x = input.nextInt();
                array[i][j] = x;
            }
        }
        
        int max = -10000;
        
        for( int i = 0; i < 4; i++ ){
        
            for( int j = 0; j < 4; j++ ) {
                int sum = 0;
                int middleCounter = 0;
                
                for( int z = i; z < i + 3; z++ ){
                    middleCounter++;
                    
                    int w = j;
                    
                    if (middleCounter == 2) {
                        sum += array[z][w+1];
                    } else {
                        sum += array[z][w] + array[z][w+1] + array[z][w+2];
                    }
    
                }
                
                if(sum > max) max = sum;
            }
        }
        
        System.out.println(max);
    }
}
