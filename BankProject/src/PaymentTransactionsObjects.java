public class PaymentTransactionsObjects {

    public static void main(String[] args) {
        PaymentMethods paymentObjects = new PaymentMethods("Jay", "Ornek");

        paymentObjects.welcomeScreen();
        paymentObjects.loginScreen();
        paymentObjects.depositMoney(350);
        paymentObjects.withdrawMoney(1000);
        paymentObjects.depositMoney(350);


        System.out.println(paymentObjects);


    }
}
