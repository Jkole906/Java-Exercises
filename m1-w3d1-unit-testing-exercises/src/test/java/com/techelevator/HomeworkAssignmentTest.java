package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest
{
	
	private HomeworkAssignment testObject;
	
	
	//Arrange test conditions (How
	
	@Before
	public void setUp() throws Exception
	{
		testObject = new HomeworkAssignment(100);
	}

	@Test
	public void testHomeworkAssignment()
	{
		assertNotNull(testObject);
	}

	@Test
	public void testScoreIs100GetA() {
		testObject.setTotalMarks(100); //Arrange
		assertEquals("A", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs90GetA() {
		testObject.setTotalMarks(90); //Arrange
		assertEquals("A", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs89GetB() {
		testObject.setTotalMarks(89); //Arrange
		assertEquals("B", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs80GetB() {
		testObject.setTotalMarks(80); //Arrange
		assertEquals("B", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs79GetC() {
		testObject.setTotalMarks(79); //Arrange
		assertEquals("C", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs70GetC() {
		testObject.setTotalMarks(70); //Arrange
		assertEquals("C", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs69GetD() {
		testObject.setTotalMarks(69); //Arrange
		assertEquals("D", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs60GetD() {
		testObject.setTotalMarks(60); //Arrange
		assertEquals("D", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs59Get() {
		testObject.setTotalMarks(59); //Arrange
		assertEquals("F", testObject.getLetterGrade());
		
	}
	@Test
	public void testScoreIs0GetF() {
		testObject.setTotalMarks(0); //Arrange
		assertEquals("F", testObject.getLetterGrade());
		
	}
	

}