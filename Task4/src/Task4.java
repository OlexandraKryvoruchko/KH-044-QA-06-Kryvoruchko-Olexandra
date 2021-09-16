import java.util.Locale;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Please, enter at least 3 words, separated by commas");
        Scanner scanner1 = new Scanner(System.in);
        String someWords = scanner1.nextLine();
        String[] words = someWords.split("," + " ");
        while (true) {
            System.out.println("Please, choose the filter");
            System.out.println("1 - maximum length");
            System.out.println("2 - start with");
            System.out.println("3 - end with");
            System.out.println("4 - contains");
            System.out.println("0 - exit");
            int choice = scanner1.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("The end");
                    System.exit(1);
                    break;
                case 1:
                    System.out.println("Enter the maximum length");
                    int maxLength = scanner1.nextInt();
                    for (String word : words) {
                        if (word.length()<=maxLength) {
                            System.out.println(word);
                        }
                    } break;
                case 2:
                    System.out.println("Enter the first letter");
                    String firstLetter = scanner1.next();
                    for (String word : words) {
                        if (word.startsWith(firstLetter))  {
                            System.out.println(word);
                        }
                    } break;
                case 3:
                    System.out.println("Enter the end letter");
                    String endLetter = scanner1.next();
                    for (String word : words) {
                        if (word.endsWith(endLetter)) {
                            System.out.println(word);
                        }
                    } break;
                case 4:
                    System.out.println("Enter the some letters");
                    String containsLetter = scanner1.next();
                    for (String word : words) {
                        if (word.contains(containsLetter)) {
                            System.out.println(word);
                        }
                    } break;
            }
        }
    }
}