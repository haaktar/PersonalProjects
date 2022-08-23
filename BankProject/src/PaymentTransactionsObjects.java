public class PaymentTransactionsObjects {

    public static void main(String[] args) {
        PaymentMethods paymentObjects = new PaymentMethods("Jay", "Ornek");

        paymentObjects.welcomeScreen();
        paymentObjects.loginScreen();
       paymentObjects.menuScreen();


       System.out.println(paymentObjects);


    }
}
