package Exception;

public class ExceptionPractice {

    public static void main(String[] args) {

        sleep(2);

        System.out.println("Hello");

        /*
        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {

        }


         */
        sleep(2);
        System.out.println("World");
/*
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

 */
        sleep(2);
        System.out.println("How are you");
    }

    public static void sleep(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {

        }
    }
}
