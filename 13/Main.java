;import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String ogString = input.nextLine();
        int loopSize = ogString.length() - 3;
        int quadruples = 0;
        
        for(int i = 0; i < loopSize; i++) {
            String first = ogString.substring(i,i+1);
            boolean quadruple = true;
            
            for(int j = i+1; j < i + 4;j++) {

                if(ogString.substring(j,j+1).equals(first) == false) {
                    quadruple = false;
                }
            }
            if (quadruple == true) quadruples++;
        }
        System.out.println(quadruples);
    }
}
