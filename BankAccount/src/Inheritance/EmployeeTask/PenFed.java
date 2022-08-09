package Inheritance.EmployeeTask;


import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {
        Tester tester = new Tester("Hakan", 'f', LocalDate.of(2022, 12, 2), "SDET", 333);

        System.out.println(tester);

        Developer developer = new Developer("Jay", 'm', LocalDate.of(2022,1,1),"QA",22);

        System.out.println(developer);
    }

}
