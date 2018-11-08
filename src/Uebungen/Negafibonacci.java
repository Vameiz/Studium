package Uebungen;

public class Negafibonacci {

    static int negaFibo(int n, NegaFiboRecCheck nfrc) {

        nfrc.nfrc();

        if (n == 0 | n == 1) {
            return 1;
        }
        else if (n > 1) {
            return negaFibo(n-2, nfrc) + negaFibo(n-1, nfrc);
        }
//            int a = 0;
//            int b = 1;
//            int i = 2;
//            while (i <= n) {
//                int aa = b;
//                int bb = a + b;
//                a = aa;
//                b = bb;
//                i++;
//            }
//             return negaFibo(n-2) + negaFibo(n-1);
//            return b;
        else if(n < 1) {
            double x = negaFibo(n - 2, nfrc) + negaFibo(n - 1, nfrc);
            double v = (Math.pow((-1), (n + 1)));
            return (int) (x*v);
        }





        }
    }

}





