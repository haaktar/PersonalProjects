import java.util.Scanner;

public class Court {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moves moves = new Moves("Larkin", "Anadolu Efes", 2.1, 33);


        System.out.println("Please select a team to start ");
        System.out.println("1- Anadolu Efes, 2- Real Madrid");

        int selection = scanner.nextInt();


        switch (selection) {

            case 1:
                System.out.println("Efes Starts");
                break;
            case 2:
                System.out.println("Real Starts");
                break;

            default:
                throw new RuntimeException("Wrong Selection");
        }

        if (selection == 1) {

            moves.gameStart("Larkin", "Anadolu Efes Istanbul");
        } else if(selection == 2) {
            moves.gameStart("Fernandez", "Real Madrid");
            moves.playerValue("Fernadez", 6.3);

        }

/*
        int secondSelection = scanner.nextInt();


        System.out.println("Please select a move:  ");
        System.out.println("1- Shot, 2-Steal");


        switch (secondSelection) {
            case 1:
                moves.gameStart("Micic", "Anadolu Efes Istanbul");
                break;
            case 2:
                moves.gameStart("Fernandez", "Real Madrid");
                moves.playerValue("Fernadez", 6.3);
                break;

            default:
                System.out.println("Wrong Selection");


        }

 */


    }

}
