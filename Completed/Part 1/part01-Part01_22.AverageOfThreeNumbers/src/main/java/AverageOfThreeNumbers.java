
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int z = Integer.valueOf(scanner.nextLine());
        
        double a = (double)(x+y+z)/3;
        
        System.out.println("The average is " + a);

    }
}
