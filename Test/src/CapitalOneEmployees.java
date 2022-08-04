import java.security.PublicKey;

public class CapitalOneEmployees {

    public static String companyName;

    public String employeeName;
    public int age;
    public String jobTitle;

    private int ID;
    private double salary;
    private String address;

    static {

        companyName = "Capital One";
    }


    public CapitalOneEmployees(String employeeName, int age, String jobTitle) {
        this.employeeName = employeeName;
        this.age = age;
        this.jobTitle = jobTitle;

    }


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public double salary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "CapitalOneEmployees{" + "employeeName='" + employeeName + '\'' + ", age=" + age + ", jobTitle='" + jobTitle + '\'' + ", ID=" + ID + ", salary=" + salary + ", address='" + address + '\'' + '}';
    }
}
