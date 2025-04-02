package TryCatch.Ex_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the numerator (integer): ");
            int numerator = sc.nextInt();
            System.out.println("Enter the denominator (integer): ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("The result of the division is : " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed ");
        }
        catch (Exception e){
            System.out.println("Error: Please enter only integers");
        }
        finally {
            sc.close();
        }
    }
}
