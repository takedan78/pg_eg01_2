package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void Maintest() {
		Main numinput = new Main();

	/*
		for(int ramanum=0; ramanum <=21; ramanum++){
			assertEquals("変換できません", Main.Romanumber(ramanum));
			System.out.println("");
		}
	*/
	
		assertEquals("変換できません", Main.Romanumber(0));
		assertEquals("Ⅰ", Main.Romanumber(1));
		assertEquals("ⅠⅠ", Main.Romanumber(2));
		assertEquals("ⅠⅠⅠ", Main.Romanumber(3));
		assertEquals("ⅠⅤ", Main.Romanumber(4));
		assertEquals("Ⅴ", Main.Romanumber(5));
		assertEquals("ⅤⅠ", Main.Romanumber(6));
		assertEquals("ⅤⅠⅠ", Main.Romanumber(7));
		assertEquals("ⅤⅠⅠⅠ", Main.Romanumber(8));
		assertEquals("ⅠⅩ", Main.Romanumber(9));
		assertEquals("Ⅹ", Main.Romanumber(10));
		assertEquals("ⅩⅠ", Main.Romanumber(11));
		assertEquals("ⅩⅠⅠ", Main.Romanumber(12));
		assertEquals("ⅩⅠⅠⅠ", Main.Romanumber(13));
		assertEquals("ⅩⅠⅤ", Main.Romanumber(14));
		assertEquals("ⅩⅤ", Main.Romanumber(15));
		assertEquals("ⅩⅤⅠ", Main.Romanumber(16));
		assertEquals("ⅩⅤⅠⅠ", Main.Romanumber(17));
		assertEquals("ⅩⅤⅠⅠⅠ", Main.Romanumber(18));
		assertEquals("ⅩⅠⅩ", Main.Romanumber(19));
		assertEquals("ⅩⅩ", Main.Romanumber(20));
		assertEquals("変換できません", Main.Romanumber(21));	
	}
}