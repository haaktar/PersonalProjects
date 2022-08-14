public class Moves extends GameMethods {


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

    public void playerHeight(String name, double height) {


        System.out.println(name + "'s height is " + height + " and he gets the points ");
    }

    public void homeTeamScore() {
        homeTeamScore += twoPoint;

       // System.out.println(homeTeamScore);

    }

    public void awayTeamScore() {
        awayTeamScore += twoPoint;

       // System.out.println(awayTeamScore);


    }

    public void gameScore() {

        System.out.println("Anadolu Efes Istanbul : " + homeTeamScore + " Real Madrid " + awayTeamScore);

        if (homeTeamScore >= 6) {
            System.out.println(" @@@@@@@@@@ Champion is @@@@@@@@@@ " + efes);
            System.exit(0);



        } else if (awayTeamScore >= 6) {
            System.out.println(" @@@@@@@@@@ Champion is @@@@@@@@@@ " + real);
            System.exit(0);




        }


    }

    public void timeOut(){

        System.out.println(teamName + " taking timeout");
    }




    @Override
    public String toString() {
        return "Moves{" + "name='" + name + '\'' + ", teamName='" + teamName + '\'' + ", height=" + height + ", age=" + age + ", score=" + twoPoint + '}';
    }
}
