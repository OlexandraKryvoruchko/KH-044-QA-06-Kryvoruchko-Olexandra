import java.util.Scanner;

public class Task3switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNumber = scan.nextDouble();

        System.out.println("Enter the operation (+, -, *, /, %)");
        String operation = scan.next();

        System.out.println("Enter the second number");
        double secondNumber = scan.nextDouble();

        switch (operation) {
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            case "%":
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("Please, enter the correct operation (+, -, *, /, %)");
        }


    }
}