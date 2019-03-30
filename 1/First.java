import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputString = input.nextLine();
        int inputInteger = input.nextInt();
        double inputDouble = input.nextDouble();

        System.out.println("String: " + inputString);
        System.out.println("Double: " + inputDouble);
        System.out.println("Int: " + inputInteger);
    }
}
