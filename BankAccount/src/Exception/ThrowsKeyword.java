package Exception;

public class ThrowsKeyword {

    public static void main(String[] args) {

        // method1();
        method2();

    }

    public static void method1() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void method2() {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }

}
