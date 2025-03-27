package Heranca_e_Polimorfism.Ex_2;

public class Program {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();

        for (Vehicle vehicle : vehicles){
            vehicle.move();
        }
    }
}
