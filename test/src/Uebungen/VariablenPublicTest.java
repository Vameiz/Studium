package Uebungen;

import static org.junit.Assert.*;
import org.junit.*;

public class VariablenPublicTest {
	// ========== SYSTEM ==========

	// ========== PUBLIC TEST ==========
	@Test(timeout = 666)
	public void pubTest__FOO_BAR() {
		assertNotEquals(0, Variablen.FOO_BAR);
	}

	@Test(timeout = 666)
	public void pubTest__Months__10_OCTOBER() {
		assertNotNull(Variablen.Months.OCTOBER);
	}

	@Test(timeout = 666)
	public void pubTest__someCharacters() {
		char[] actual = Variablen.someCharacters();
		assertEquals('D', actual[3]);
	}

	@Test(timeout = 666)
	public void pubTest__someMoreCharacters() {
		char[][] actual = Variablen.someMoreCharacters();
		assertEquals(1, actual[0][1]);
		assertEquals(66, actual[1][1]);
		assertEquals(0x31, actual[2][1]);
		assertEquals(0142, actual[3][1]);
	}

	@Test(timeout = 666)
	public void pubTest__theCube() {
		int[][][] actual = Variablen.theCube();
		assertEquals(321, actual[2][1][0]);
	}
}