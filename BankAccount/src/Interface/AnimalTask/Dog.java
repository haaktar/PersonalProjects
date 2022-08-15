package Interface.AnimalTask;

public class Dog extends Animal implements Playable,Swimmwable{

    public void sleep(){

        System.out.println("Dog is sleeping");

    }

    public void eat(){

        System.out.println("Dog is eating");

    }

    public void playable(){

        System.out.println("Dof is playing");

    }

    public void swim(){

        System.out.println("Dog is swimming");

    }
}
