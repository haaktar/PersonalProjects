public class Moves extends Player {


    public Moves(String name, String teamName, double height, int age) {
        super(name, teamName, height, age);

    }

    public void gameStart(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;

        System.out.println("Game Starts and " + name + " gets the ball " +

                name + " shoots and yes buckets! " + teamName + " added 2 point");

        System.out.println("        *****  B A S K E T  *****     ");

    }

    public void steal(String name, String teamName) {

        System.out.println(name + " steals the ball for " + teamName);
    }


    @Override
    public String toString() {
        return "Moves{" + "name='" + name + '\'' + ", teamName='" + teamName + '\'' + ", height=" + height + ", age=" + age + ", score=" + score + '}';
    }
}
