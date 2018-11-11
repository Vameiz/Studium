package Uebungen;

public class Negafibonacci {

    public static int negaFibo(int n, NegaFiboRecCheck nfrc) {

        nfrc.nfrc();

        if (n == 0 | n == 1) {
            return 1;
        }
        else if (n > 1) {
            return negaFibo(n-2, nfrc) + negaFibo(n-1, nfrc);
        }

        else if(n < 1) {
            double x = negaFibo(n - 2, nfrc) + negaFibo(n - 1, nfrc);
            double v = (Math.pow((-1), (n + 1)));
            return (int) (x*v);
        }




        return Integer.parseInt("");


    }
    public interface NegaFiboRecCheck {
        public void nfrc();
    }



    }





