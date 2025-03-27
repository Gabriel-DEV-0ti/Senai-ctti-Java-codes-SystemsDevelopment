package Heranca_e_Polimorfism.Ex_4;

public class PaymentCard extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Card payment approved!");
    }
}
