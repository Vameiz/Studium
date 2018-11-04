package Uebungen;

public class GameOfDice {

    public static String game(String[] args) {
        int len, d1, s1, d2, s2;
        String[] ds;
        //array für das addieren der zahlen und e als entscheidungstraeger
        for (int i = 0; i < args.length; i++) {
            String zaehler =len;
            String zaehler += args[i];
        }


        //wert von e als Aussgabe
        int e;
        if (e == -1) {
            System.out.println("Illegal Input");
        } else if (e == 0) {
            System.out.println("Draw");
        } else if (e == 1) {
            System.out.println("Player 1 won");
        } else if (e == 2) {
            System.out.println("Player 2 won");
        } else {
            System.out.println("Game Error");
        }
        return e;
    }
}
