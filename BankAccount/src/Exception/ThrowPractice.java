package Exception;

public class ThrowPractice {

    public static void m1() throws InterruptedException {

        Thread.sleep(1000);
    }

    public static void m2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
