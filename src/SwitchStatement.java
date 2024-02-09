import java.util.Scanner;

public class SwitchStatement {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the operation you want to perform: ");
        String operation = scanner.nextLine();

        switch (operation){
            case "sum" :
                System.out.printf("Their sum is %f + %f = %f" , number1, number2, number1 + number2);
                break;

            case "subtract" :
                System.out.printf("Their sum is %f - %f = %f" , number1, number2, number1 - number2);
                break;

            case "multiply" :
                System.out.printf("Their sum is %f * %f = %f" , number1, number2, number1 * number2);
                break;

            case "divide" :
                if (number2 == 0){
                    System.out.print("You cannot divide by Zero");
                }else {
                    System.out.printf("Their sum is %f / %f = %f", number1, number2, number1 / number2);
                }
                break;
            default:
                System.out.printf("%s is an invalid operation", operation);
        }
    }
}
