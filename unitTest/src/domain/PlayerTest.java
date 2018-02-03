package domain;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

public class PlayerTest {
	
	Player player1;
	static Player player2;
	
	@Before
	public void testInit() {
		player1 = new Player("Tomek");
	}
	
	@Test
	public void testOfPlayer() {
		assertNotNull(player1.getName());
		assertEquals(player1.getPointsOfPlayer() , 301);
	}
	
	@Test
	public void testSubstrackt() {
		assertTrue(player1.substrackPoints(301));
		assertEquals(player1.getPointsOfPlayer(),0);
		
		assertFalse(player1.substrackPoints(1));
		assertEquals(player1.getPointsOfPlayer(),0);
	}
	
	@BeforeAll
	public static void testBefore() {
		player2 = new Player("Romek");
	}
	
	@RepeatedTest(100)
	public void testThorowDart() {
		player2.playerTurn();
	}

	@Test
	public void test() {
		assertEquals(player2.getPointsOfPlayer(),0);
	}
	
}
