package TryCatch.Ex_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String prohibited = sc.nextLine();

        try {
            int number = Integer.parseInt(prohibited);
            System.out.println("The number entered is: " + prohibited);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid value!!");
        }
        finally {
            sc.close();
        }
    }
}
