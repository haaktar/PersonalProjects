package Exception;

import java.time.LocalDate;
import java.time.LocalTime;

public class ThrowKeywordPractice {

    public static void main(String[] args) {

        String browserName = "Safari";

        if (browserName.equals("IE")) {

            System.out.println("IE Starting");

        } else if (browserName.equals("Fire Fox")) {
            System.out.println("Fire Fox starting");
        } else {

            throw new RuntimeException("Invalid Browser Name");
        }

        System.out.println("================");

       if (LocalTime.now().getHour()==4){

           throw new RuntimeException("Time is Break");
       }else {
           System.out.println("No break time");
       }
    }
}
