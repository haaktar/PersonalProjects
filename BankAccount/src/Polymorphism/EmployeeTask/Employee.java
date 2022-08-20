package Polymorphism.EmployeeTask;

public abstract class Employee {

    String name, jobTitle;
    int id;
    char gender;

    public abstract void work();

    public Employee(String name, String jobTitle, int id, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
