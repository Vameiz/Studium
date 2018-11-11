package Uebungen;


public class Hanoi {


    public static String solve(int n, String start, String spare, String target, HanoiRecCheck hrc) {
        hrc.checkRecHanoi();
        if (n <= 0) {
            return "";
        } else {
            if (n == 1) {
                System.out.println(start + "->" + target);
            } else {
                solve(n - 1, start, spare, target, hrc);
                System.out.println(start + "->" + target);
                solve(n - 1, spare, target, start, hrc);
            }


        }
        return "";

    }

}
