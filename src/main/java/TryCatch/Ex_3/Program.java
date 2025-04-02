package TryCatch.Ex_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = sc.nextDouble();

        try {
            calculateSquareRoot(number);
        }
        catch (Exception e){
            System.out.println("Invalid value!!");
        }
        finally {
            sc.close();
        }
    }

    private static void calculateSquareRoot(Double number) throws IllegalAccessException {
        if (number < 0){
            throw new IllegalAccessException("Negative number is not allowed");
        }

        double root = Math.sqrt(number);
        System.out.println("The square root of " + number + " and " + root);
    }
}
