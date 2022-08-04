package Exception;

import java.util.ArrayList;

public class ExceptionHandling {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        String exceptionMessage = "";

        try {

            System.out.println(arrayList.get(1));

        } catch (IndexOutOfBoundsException e) {

            exceptionMessage = e.getMessage();

            System.out.println(exceptionMessage);

        }

        System.out.println("Next Step");


    }
}
