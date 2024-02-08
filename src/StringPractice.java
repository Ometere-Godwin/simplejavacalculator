import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();
        System.out.printf("Hello, %s. How are you doing?", name);

        scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.printf("%s is a good age to start programming", age);

        scanner.nextLine();

        System.out.println("What programming language do you prefer?");
        String language = scanner.nextLine();

        System.out.printf("%s is a good programming language", language);

        scanner.close();
    }
}
