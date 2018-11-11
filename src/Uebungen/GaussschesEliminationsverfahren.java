package Uebungen;

public class GaussschesEliminationsverfahren {

    public static void pivotisiere(long[][] matrix, long[] vektor, int position) {
        int max = position;

        for (int i = position; i < matrix.length; ++i) {
            if (Math.abs(matrix[i][position]) > Math.abs(matrix[max][position])) {
                max = i;
            }
        }

        long[] a1 = matrix[position];
        matrix[position] = matrix[max];
        matrix[max] = a1;
        long a2 = vektor[position];
        vektor[position] = vektor[max];
        vektor[max] = a2;

    }

    public static void eleminiere(long[][] matrix, long[] vektor, int position) {
        for (int d = 1; d < matrix.length - position; d++) {
            long marker = matrix[position + d][position];
            for (int i = position; i < matrix[position].length; i++) {
                matrix[position + d][i] = -((matrix[position + d][i] * matrix[position][position]) - (marker * matrix[position][i]));
            }
            vektor [position + d] = -(vektor[position + d] * matrix[position][position] - marker * vektor[position]);
            }
        }


    public static double[] loese(long[][] matrix, long[] vektor) {
        double a = vektor[2] / matrix[2][2];
        double b = (vektor[1] - matrix[1][2] * a) / (double) matrix[1][1];
        double c = (vektor[0] - matrix[0][1] * b - matrix[0][2] * a) / matrix[0][0];

        double[] loesungsvektor = new double[]{c, b, a};

        return loesungsvektor;


    }

}


 
