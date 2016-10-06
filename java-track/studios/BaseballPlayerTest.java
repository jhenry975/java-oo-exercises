import static org.junit.Assert.*;

import org.junit.Test;

public class BaseballPlayerTest {

	@Test
	public void testInGame()
	{
		BaseballPlayer g = new BaseballPlayer(null, 3, null, 2, 3, 1, 0, 0, 0);
		assertTrue(g.getRuns() == 2);
		assertTrue(g.getRbi() == 3);
		assertTrue(g.getGames() == 1);
	}

}
