package Heranca_e_Polimorfism.Ex_4;

public class Program {
    public static void main(String[] args) {
<<<<<<< HEAD
        
=======
        Payment[] payments = new Payment[3];

        payments[0] = new PaymentCard();
        payments[1] = new PaymentMoney();
        payments[2] = new PaymentCard();

        for (Payment payment : payments){
            payment.makePayment();
        }
>>>>>>> d457ce9 (Commit de atualizacao: Exercicios resolvidos)
    }
}
