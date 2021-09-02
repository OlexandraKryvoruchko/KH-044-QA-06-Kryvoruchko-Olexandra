import java.util.Scanner;

public class Task2S {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Where are you live, " + name +"?");
        String address = scan.nextLine();
        String wholeInformation = name + " - " + address;
        System.out.println(wholeInformation);
    }
}
