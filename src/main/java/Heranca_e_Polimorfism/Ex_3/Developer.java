package Heranca_e_Polimorfism.Ex_3;

public class Developer extends Employee {

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 1.10;
    }
}
