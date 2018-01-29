package com.techelevator;

public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	private int startingPiecesOfFruit;
	

	
	//Constructor
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.startingPiecesOfFruit = startingPiecesOfFruit;
	}
	//Methods
	
	public boolean pickFruit (int numberOfPiecesToRemove) {
		if(startingPiecesOfFruit - numberOfPiecesToRemove >= 0) {
			startingPiecesOfFruit = startingPiecesOfFruit - numberOfPiecesToRemove;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	public String getTypeOfFruit()
	{
		return typeOfFruit;
	}



	public int getPiecesOfFruitLeft()
	{
		return piecesOfFruitLeft = startingPiecesOfFruit;
	}



	public int getStartingPiecesOfFruit()
	{
		return startingPiecesOfFruit;
	}
	
	
	 //THESE VARIABLE NAMES ARE HORRIBLE
	
	
	
	
	
	
	
}
