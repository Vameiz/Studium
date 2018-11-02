package Uebungen;

public class Variablen {
	// TODO: declare a constant named "FOO_BAR" with a value of -123.456 * 10^(-89)

	public static double FOO_BAR = -123.456 * (10 ^ (-89));

	// TODO: declare an enumeration named "Months" containing the
	// english names in CAPITAL_LETTERS (!) of all the 12 months of the year in correct chronological order
	public enum Months{
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}

	public static char[] someCharacters() {
		// TODO: declare, fill and return an 1-dimensional
		// array containing the ASCII-letters A to Z (capital letters)
		int[] zahl;
		int[]= new int [26];
		int i = 0;
		 while (i<zahl.laenght){
		 	zahl[i]=i;
		 	return(zahl[i]);
		 	i++;
		 }


		return (char(i));
	}

	public static char[][] someMoreCharacters() {
		// TODO: declare, fill and return a 2-dimensional array containing
		// 1) the values (!) 0 to 25 in the first row,5
		// 2) the ASCII-letters A to Z (capital letters) in the second row,
		// 3) the ASCII-characters (!) 0 to 9, then 0 to 9 again and finally 0 to 5 in the third row
		// 4) the ASCII-letters a to z (non-capital letters) in the fourth row,
		char [][]sMC={
				{0, 1, 2, 3, 4},
				{'A', 'B'},
				{'0', '1'},
				{'a', 'z'}
		}


		return sMC;
	}

	public static int[][][] theCube() {
        int[][][] tC= new int[3][3][3];

        int x, y, z;

        for (x = 0; x<3; x++){
            for (y = 0; y < 3; y++){
                for (z = 0; z < 3; z++){
                    int pos =   ((x + 1) * 100) + ((y + 1) * 10) + (z + 1);
                    tC[x][y][z] = pos;
                }
            }

        }
		// TODO: declare, fill and return a 3-dimensional array
		// of size 3x3x3 (try to imagine a http://en.wikipedia.org/wiki/Rubik's_Cube)
		// containing only integer numbers such that
		// the value at [x][y][z] == (x+1)*100+(y+1)*10+(z+1)
		// (e.g. cube[2][1][0] == 321)
		return tC;
	}
}