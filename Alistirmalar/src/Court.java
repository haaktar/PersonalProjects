import java.util.Scanner;

public class Court{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Efes, 2 Real");

        Moves moves = new Moves("Larkin", "Fener", 2.1,33);

        int selection = scanner.nextInt();


        switch (selection) {

            case 1:
                System.out.println("Efes Starts");
                moves.gameStart("Micic");
                break;
            case 2:
                System.out.println("Real Starts");
                break;

            default:
                System.out.println("Wrong Selection");
        }

        System.out.println("1 steals, 2 game start");

        switch (selection){

            case 1:
                System.out.println("steals");

                moves.steal();
                break;

            case 2:
                System.out.println("inbound");

                moves.gameStart("Ibo");
                break;

            default:
                System.out.println("wrong selection");





        }


    }

}


