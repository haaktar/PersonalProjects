import java.util.Scanner;

public class Court {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moves moves = new Moves("Larkin", "Anadolu Efes", 2.1, 33);


        System.out.println("Please select a team to start ");
        System.out.println();
        System.out.println("1- Anadolu Efes, 2- Real Madrid");
        System.out.println();


        boolean loopRepeat = true;

        //  while (loopRepeat) {
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
            moves.homeTeamScore();
            moves.gameScore();
        } else if (selection == 2) {
            moves.gameStart("Fernandez", "Real Madrid");
            moves.playerHeight("Fernadez", 6.3);
            moves.awayTeamScore();
            moves.gameScore();

        }
        while (loopRepeat) {
            System.out.println(" Select a Team- 1 " + moves.efes + " 2 " + moves.real);
            System.out.println();

            //   }


            int selectionTwo = scanner.nextInt();

            System.out.println(" Select a Move 1- Time Out  2- Offence");
            System.out.println();



            int selectionThree = scanner.nextInt();


            if (selectionTwo == 1) {
                moves.teamName = moves.efes;
                System.out.println(" Select a Move 1- Time Out  2- Offence");
                System.out.println();

                if (selectionThree == 1) {
                    moves.timeOut();
                } else if (selectionThree == 2) {
                    moves.homeTeamScore();
                    moves.gameScore();


                }
            } else if (selectionTwo == 2) {
                moves.teamName = moves.real;
                System.out.println(" Select a Move 1- Time Out  2- Offence");
                System.out.println();
                if (selectionThree == 1){
                    moves.timeOut();
                }else if (selectionThree==2){
                    moves.awayTeamScore();
                    moves.gameScore();
                }


            }

            //System.out.println(" Select a Move 1- Time Out  2- Offence");



                /*

                switch (selectionThree) {

                    case 1:
                        moves.timeOut();
                        break;

                    case 2:
                        moves.homeTeamScore();
                        moves.gameScore();
                        break;
                }

                 */



        }

    }


}


