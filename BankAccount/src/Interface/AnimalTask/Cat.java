package Interface.AnimalTask;

public class Cat extends Animal implements Playable{

    @Override
    public void eat() {

        System.out.println("Cat is eating");

    }

    @Override
    public void sleep() {

        System.out.println("Cat is sleeping");

    }
    @Override
    public void playable(){

    }
}
