package Inheritance.InheritancePracticeTwo;

public class Tester extends  Employee{


    public  Tester(String name, int age, char gender, double salary, int ID, String jobTitle) {

       setInfo(name, age, gender, salary, ID, jobTitle);

    }

    public void smokeTesting(){

        System.out.println(name + " Smoking");
    }

    public void creatingTicket(){
        System.out.println(name + " Tiketing");
    }


}
