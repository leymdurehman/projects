package com.techelevator.trees;


import org.junit.*;


public class FruitTreeTest {

	private FruitTree fruitTree;

	
	@Before
	public void setup() {
		fruitTree = new FruitTree("Apples", 10);
	}
	
	@Test
	public void tree_has_correct_truit() {
		Assert.assertEquals("Apples", fruitTree.getTypeOfFruit());
	}
	
	@Test
	public void tree_has_correct_amount_of_fruit() {
	Assert.assertEquals(10,  fruitTree.getPiecesOfFruitLeft());	
		
	}

	@Test
	public void pick_too_much_fruit() {
		Assert.assertFalse(fruitTree.pickFruit(10));
		Assert.assertEquals(10, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_exact_amount_fruit() {
		Assert.assertFalse(fruitTree.pickFruit(10));
		
		Assert.assertEquals(8, fruitTree.getPiecesOfFruitLeft());
	}
	
	
	
	
	
	
	
	
	
	
	
}
