import java.util.Scanner;

public class Task3while1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNumber = scan.nextDouble();

        System.out.println("Enter the operation (+, -, *, /, %)");
        String operation = scan.next();

        System.out.println("Enter the second number");
        double secondNumber = scan.nextDouble();

        while (true) {
            if (operation.equals("+")) {
                System.out.println(firstNumber + secondNumber);
                break;
            } else if (operation.equals("-")) {
                System.out.println(firstNumber - secondNumber);
                break;
            } else if (operation.equals("*")) {
                System.out.println(firstNumber * secondNumber);
                break;
            } else if (operation.equals("/")) {
                System.out.println(firstNumber / secondNumber);
                break;
            } else if (operation.equals("%")) {
                System.out.println(firstNumber % secondNumber);
                break;
            } else System.out.println("Please, enter correct operation (+, -, *, /, %)");
            operation = scan.next();
        }
    }
}
