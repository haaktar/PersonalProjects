package Inheritance.InheritancePracticeTwo;

public class Employee extends Person {

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, double salary, int ID, String jobTitle) {
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
    }

    public void work() {

        System.out.println(" Salary for " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

