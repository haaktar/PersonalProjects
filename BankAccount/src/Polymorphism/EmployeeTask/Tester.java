package Polymorphism.EmployeeTask;

public class Tester extends Employee {

    public Tester(String name, String jobTitle, int id, char gender) {
        super(name, jobTitle, id, gender);
    }

    @Override
    public void work() {

        System.out.println(name+ " tests");

    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
