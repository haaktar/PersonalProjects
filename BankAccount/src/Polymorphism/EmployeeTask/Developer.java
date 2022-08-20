package Polymorphism.EmployeeTask;

public class Developer extends Employee {

    public Developer(String name, String jobTitle, int id, char gender) {
        super(name, jobTitle, id, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " develops");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
