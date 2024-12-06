import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        double sum, num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number to sum");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number to sum");
        num2 = sc.nextDouble();

        sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
