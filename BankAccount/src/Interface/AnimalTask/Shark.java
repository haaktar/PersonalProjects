package Interface.AnimalTask;

public class Shark extends Animal implements Swimmwable{

    public void sleep(){

        System.out.println("Shark is sleeping");

    }

    public void eat(){

        System.out.println("Shark is eating");

    }

    @Override
    public void swim() {

        System.out.println("Shark is swiming");

    }
}

