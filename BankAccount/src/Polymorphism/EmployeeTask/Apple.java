package Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {
        Employee tester1 = new Tester("Hakan", "SDET", 1988, 'M');
        Employee tester2 = new Tester("Beyza", "QA", 314, 'F');

        Employee developer1 = new Developer("Mustafa", "Dev", 432, 'M');
        Employee developer2 = new Developer("Semih", "Dev", 455, 'M');

        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1, tester2, developer1, developer2));

        for (Employee each: scrumTeam ) {

            System.out.println(each);

        }
    }
}
