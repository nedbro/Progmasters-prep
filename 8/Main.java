import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int q = input.nextInt();
        int[][] queryArray = new int[q][3];
        
        for( int i = 0; i < q; i++ ) {
            queryArray[i][0] = input.nextInt();
            queryArray[i][1] = input.nextInt();
            queryArray[i][2] = input.nextInt();
        }
        
        for( int i = 0; i < q; i++ ){
            String output = "";
            int max = queryArray[i][2];
            int sum = queryArray[i][0] + queryArray[i][1];
            
            output += "" + sum;
            
            for( int j = 1; j < max; j++ ){
                sum += (Math.pow(2,j)) * queryArray[i][1];
                output += " " + sum;
            }
            
            System.out.println(output);
        }
        
    }
}
