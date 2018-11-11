package Uebungen;

public class Negafibonacci {

    public static int negaFibo(int n, NegaFiboRecCheck nfrc) {

        nfrc.nfrc();

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        else if (n > 1) {
            return negaFibo(n-1, nfrc) + negaFibo(n-2, nfrc);
        }

        else if(n < 1) {
            double x = negaFibo(n + 1, nfrc) + negaFibo(n + 2, nfrc);
            double v = (Math.pow((-1), (n + 1)));
            return (int) (x*v);
        }




        return Integer.parseInt("");
    }
}






