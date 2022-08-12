public class GameMethods {

    String name;
    String teamName;
    double height;
    int age;
    static int twoPoint = 2;
    int homeTeamScore;
    int awayTeamScore;
    static String efes = " Anadolu Efes ";
    static String real = " Real Madrid ";

    private double salary;
    // Scanner scanner = new Scanner(System.in);


    public GameMethods(String name, String teamName, double height, int age) {
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

    public void homeTeamScore() {

        homeTeamScore += twoPoint;

        System.out.println(homeTeamScore);

    }

    public void awayTeamScore() {

        awayTeamScore += twoPoint;

        System.out.println(awayTeamScore);


    }

    public void gameScore() {

        System.out.println("Anadolu Efes Istanbul : " + homeTeamScore + " Real Madrid " + awayTeamScore);

        if (homeTeamScore >= 58) {
            System.out.println(" @@@@@@@@@@ Champion is @@@@@@@@@@ " + efes);
            System.exit(0);

        } else if (awayTeamScore >= 58) {
            System.out.println(" @@@@@@@@@@ Champion is @@@@@@@@@@ " + real);
            System.exit(0);



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
}