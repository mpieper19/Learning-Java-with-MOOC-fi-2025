
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int addResult = first + second;
        int subResult = first - second;
        int multResult = first * second;
        double divResult = (double) first / second;

        System.out.println(first + " + " + second + " = " + addResult);
        System.out.println(first + " - " + second + " = " + subResult);
        System.out.println(first + " * " + second + " = " + multResult);
        System.out.println(first + " / " + second + " = " + divResult);

    }
}
