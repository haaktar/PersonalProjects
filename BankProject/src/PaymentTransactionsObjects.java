public class PaymentTransactionsObjects {

    public static void main(String[] args) {
        PaymentMethods paymentObjects = new PaymentMethods("Jay", "Ornek");
        TransferMoney transferMoney = new TransferMethods("hakan", "Aktar");

        paymentObjects.welcomeScreen();
        paymentObjects.loginScreen();
        paymentObjects.menuScreen();



        System.out.println(paymentObjects);


    }
}
