import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean winner(String[] hraciaPlocha) {
        String[] vX = hraciaPlocha;
        if (vX[0].equals(vX[1]) && vX[0].equals(vX[2]) || vX[3].equals(vX[4]) && vX[3].equals(vX[5]) || vX[6].equals(vX[7]) && vX[6].equals(vX[8]) || vX[0].equals(vX[3]) && vX[0].equals(vX[5]) || vX[1].equals(vX[4]) && vX[1].equals(vX[6]) || vX[2].equals(vX[5]) && vX[2].equals(vX[7]) || vX[2].equals(vX[4]) && vX[2].equals(vX[6]) || vX[0].equals(vX[4]) && vX[0].equals(vX[8])) {
            //System.out.println("Vyhral hrac X");
            return true;
        } else return false;
    }
//    public static boolean playAgain(String d){
//
//        while (true) {
//            try {
//                Scanner scanner = new Scanner(System.in);
//                String playAgain = scanner.nextLine();
//                if (playAgain.equals("ano")) {
//                    vstup = 0;
//                    //hrac = "X";
//                    hP = hPNew;
//                    i = 1;
//                    break;
//                } else if (playAgain.equals("nie")) {
//                    System.out.println("Koniec hry");
//                    System.exit(0);
//                }
//            } catch (Exception e) {
//                System.out.println("Neplatny vstup");
//                scanner.nextLine();
//            }
//        }

    //}


    public static void main(String[] args) {
        int vstup = 0;
        String hrac = "X";
        Scanner scanner = new Scanner(System.in);

        //hracia plocha
        String[] hP = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        String[] hPNew = {" ", " ", " ", " ", " ", " ", " ", " ", " "};


        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                hrac = "X";
            } else {
                hrac = "O";
            }
            System.out.println("Hrac " + hrac + " zadaj cislo od 1 do 9:");

            while (true) {
                try {
                    vstup = scanner.nextInt();
                    if (vstup >= 1 && vstup <= 9 && hP[vstup - 1].equals(" ")) {
                        break;
                    } else {
                        System.out.println("Zadaj ine cislo:");
                    }
                } catch (Exception e) {
                    System.out.println("Neplatny vstup");
                    scanner.nextLine();
                }
            }

            hP[vstup - 1] = hrac;

            System.out.println(hP[0] + "|" + hP[1] + "|" + hP[2]);
            System.out.println("------");
            System.out.println(hP[3] + "|" + hP[4] + "|" + hP[5]);
            System.out.println("------");
            System.out.println(hP[6] + "|" + hP[7] + "|" + hP[8]);

            boolean a = false;
            for (int j = 0; j < 9; j++) {
                if (hP[j] == " ") {
                    a = false;
                } else {
                    a = true;
                }
            }
            if (a) {
                System.out.println("remiza");
                String plAg = scanner.nextLine();
                //playAgain(plAg);
            }

            if (hP[0].equals(hrac) && hP[0].equals(hP[1]) && hP[0].equals(hP[2]) || hP[3].equals(hrac) && hP[3].equals(hP[4]) && hP[3].equals(hP[5]) || hP[6].equals(hrac) && hP[6].equals(hP[7]) && hP[6].equals(hP[8]) || hP[0].equals(hrac) && hP[0].equals(hP[3]) && hP[0].equals(hP[5]) || hP[1].equals(hrac) && hP[1].equals(hP[4]) && hP[1].equals(hP[6]) || hP[2].equals(hrac) && hP[2].equals(hP[5]) && hP[2].equals(hP[7]) || hP[2].equals(hrac) && hP[2].equals(hP[4]) && hP[2].equals(hP[6]) || hP[0].equals(hrac) && hP[0].equals(hP[4]) && hP[0].equals(hP[8])) {
                System.out.println("Vyhral hrac " + hrac);


            }


        }

    }
}