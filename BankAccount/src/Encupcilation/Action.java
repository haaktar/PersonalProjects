package Encupcilation;

public class Action {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Hakan", "Aktar");

        bankAccount.deposit(1250);

        bankAccount.withdraw(1000);

       // System.out.println(bankAccount.getBalance());


    }


}
