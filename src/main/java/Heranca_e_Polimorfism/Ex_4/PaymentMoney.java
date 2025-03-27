package Heranca_e_Polimorfism.Ex_4;

public class PaymentMoney extends Payment{
    @Override
    public void makePayment() {
        System.out.println("Cash payment received!");
    }
}
