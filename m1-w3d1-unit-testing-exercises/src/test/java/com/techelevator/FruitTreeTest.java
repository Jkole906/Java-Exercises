package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	private FruitTree tree;
	
	
	@Before
	public void setup() throws Exception{
		tree = new FruitTree("Apple", 10); //Arrange
		
	}

	@Test
	public void testFruitTree()
	{
		assertNotNull(tree);
	}//"assert" means "test to see if"

	@Test
	public void testGetTypeOfFruit()
	{
		assertEquals("Apple", tree.getTypeOfFruit());
	}

	@Test
	public void testGetPiecesOfFruitLeft()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testPickFruitDoesNotAllowNegatives()
	{
		boolean result = tree.pickFruit(-1); // Act
		assertEquals(false, result);
		assertEquals(10, tree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void testPicksLessThanTotalFruit() {
		boolean result = tree.pickFruit(5);
		assertTrue(result);
		assertEquals(5, tree.getPiecesOfFruitLeft());
	}
	@Test
	public void testPicksMoreThanTotalFruit() {
		boolean result = tree.pickFruit(11);
		assertEquals(10, tree.getPiecesOfFruitLeft());
		assertFalse(result);
	}
	
	

}
