import java.util.Scanner;

public class Player {

    String name;
    String teamName;
    double height;
    int age;
    int score;

    private double salary;
    Scanner scanner = new Scanner(System.in);


    public Player(String name, String teamName, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.teamName = teamName;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    public double getSalary() {

        return salary;
    }


/*


public void gameStart() {
        System.out.println("Game Starts and " + name + " gets the ball " +

                name + " shoots and yes buckets! " + teamName + " added 2 point");

        System.out.println("    B A S K E T     ");
    }

    public void steals() {

        System.out.println(name + " steals the ball");

    }

    public void timeOut() {

        System.out.println("Time out " + "by " + teamName);
    }

    public void score(int point) {

        int score = 0;
        this.score = score;

        score =+ point;
        System.out.println(score);


    }


    public static void main(String[] args) {


        Player anadoluEfesPlayer1 = new Player("Larkin", 6.0, "Anadolu Efes");
        Player realMadridPlayer1 = new Player("Lull", 6.1, "Real Madrid");

        anadoluEfesPlayer1.setSalary(1_200_000);

        anadoluEfesPlayer1.gameStart();

        realMadridPlayer1.steals();

        anadoluEfesPlayer1.timeOut();

        anadoluEfesPlayer1.score(3);
        anadoluEfesPlayer1.score(4);




    }

 */
}
