package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void Maintest() {
		Main numinput = new Main();

		for(int ramanum=0; ramanum <=21; ramanum++){
			assertEquals("変換できません", Main.Romanumber(ramanum));
			System.out.println("");
		}
	}
	}
