package Heranca_e_Polimorfism.Ex_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name: ");
        String nameEmployee = sc.nextLine();
        System.out.println("Enter the Employee base salary: R$ ");
        double baseSalaryEmployee = sc.nextDouble();
        Employee employee = new Employee(nameEmployee, baseSalaryEmployee);

        sc.nextLine();
        System.out.println("Enter Manager name:");
        String nameManager = sc.nextLine();
        System.out.println("Enter the Manager's base salary: R$ ");
        double baseSalaryManager = sc.nextDouble();
        double bonus = 1500;
        Manager manager = new Manager(nameManager, baseSalaryManager, bonus);

        sc.nextLine();
        System.out.println("Enter Developer name: ");
        String nameDeveloper = sc.nextLine();
        System.out.println("Enter the Developer");
        double baseSalaryDeveloper = sc.nextDouble();
        Developer developer = new Developer(nameDeveloper, baseSalaryDeveloper);

        System.out.println("Employee: " + nameEmployee + ", Salary: " +  employee.calculateSalary());
        System.out.println("Manager: " + nameManager + ", Salary: " +  manager.calculateSalary());
        System.out.printf("Developer: %s, Salary R$: %.2f " ,nameDeveloper,developer.calculateSalary());

        sc.close();

    }

}
