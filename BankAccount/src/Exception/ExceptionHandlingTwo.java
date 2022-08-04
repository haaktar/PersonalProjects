package Exception;

public class ExceptionHandlingTwo {
    public static void main(String[] args) {

        String exceptionMessage = "";

        try {

            System.out.println(10/0);


        }catch (ArithmeticException e){
            exceptionMessage = e.getMessage();

            System.out.println(exceptionMessage);
        }
    }

}
