package Inheritance;

public class Cat extends Animal{

    public Cat(String name, String size, int age, char gender){

        setInfo("Sari 2", "4", 1,'M');


    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
