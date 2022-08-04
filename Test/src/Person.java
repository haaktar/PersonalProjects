import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public LocalDate DOB;

    private int ssn;
    private int ID;
    private String address;

    public Person(String name, int age, LocalDate DOB) {

        this.name = name;
        this.age = age;
        this.DOB = DOB;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public int getSsn() {
        return ssn;
    }

    public int getID() {
        return ID;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DOB=" + DOB +
                ", ssn=" + ssn +
                ", ID=" + ID +
                ", address='" + address + '\'' +
                '}';
    }
}
