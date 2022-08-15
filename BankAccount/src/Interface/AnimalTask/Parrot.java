package Interface.AnimalTask;

public class Parrot extends Animal implements Flyable, Playable, Talkative{
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {

        System.out.println("Parrot is sleeping");

    }

    @Override
    public void fly() {

    }

    @Override
    public void playable() {

    }

    public void talkative(){

    }
}
