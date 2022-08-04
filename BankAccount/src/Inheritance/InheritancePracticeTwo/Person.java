package Inheritance.InheritancePracticeTwo;

public class Person {

    public String name;
    public int age;
    public char gender;

    private long ssn;


    public void setInfo(String name, int age, char gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setSsn(long ssn) {

        this.ssn = ssn;
    }

    public long getSsn() {

        return ssn;
    }

    public void walk() {

        System.out.println(name + " is walks at " + age);
    }


}
