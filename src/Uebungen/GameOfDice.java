

public class GameOfDice {

    public static int game(String[] dices) {
        int p1 = 0, p2 = 0;
        String[] ds;


        if ((dices.length % 2) == 1)
            return -1;

        int haleftelaenge = dices.length / 2;
        
        for (int i = 0; i < dices.length; i++) {
            int num = Integer.parseInt(dices[i]);
            if (num < 0) return -1;
            if (num > 6) return -1;
                if (i <= (haleftelaenge - 1)) {
                    p1 = p1 + num;
                } else {
                    p2 = p2 + num;
                }

        }
        if(p1 > p2){
            return 1;
        }else if (p1 == p2){
            return 0;
        }
        else{
            return 2;
        }
//        //wert von e als Aussgabe
//        int e;
//        if (e == -1) {
//            System.out.println("Illegal Input");
//        } else if (e == 0) {
//            System.out.println("Draw");
//        } else if (e == 1) {
//            System.out.println("Player 1 won");
//        } else if (e == 2) {
//            System.out.println("Player 2 won");
//        } else {
//            System.out.println("Game Error");
//        }
//        return e;
//    }
    }
}