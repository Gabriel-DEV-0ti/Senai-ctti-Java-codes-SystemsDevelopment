package TryCatch.Ex_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: ");
            int number1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int number2 = sc.nextInt();

            int result = number1 + number2;
            System.out.println("The sum of the numbers entered is: " + result);
        }
        catch (InputMismatchException e){
            System.out.println("Error: Invalid value");
        }
        finally {
            sc.close();
        }
    }
}
