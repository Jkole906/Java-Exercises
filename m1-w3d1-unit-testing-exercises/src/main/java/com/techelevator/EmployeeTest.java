package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest
{
	
	private Employee testObject;
	

	@Before
	public void setUp() throws Exception
	{
		
		testObject = new Employee(001, "John", "Smith", 50000.00);
	}

	
	
	
	
	
	@Test
	public void testLongFirstName() {
		testObject = new Employee(001, "Johnnnnnnnnnnnnnnnnnnn", "Smith", 50000.00);
	    assertEquals("Johnnnnnnnnnnnnnnnnnnn", testObject.FirstName());
	}
	
	
	@Test
	public void testLongLastName() {
		testObject = new Employee(001, "John", "Smithhhhhhhhhhhhhhhhhhhhh", 50000.00);
	    assertEquals("Smithhhhhhhhhhhhhhhhhhhhh", testObject.LastName());
	}
	
	@Test
	public void test0Salery() {
		testObject = new Employee(001, "John", "Smith", 0.00);
	    assertEquals(0.0, testObject.getAnnualSalary(), 0.0001);
	}
	    
	
	
	    
	    
	    
	    
	    
	@Test
	public void testEmployee()
	{
		assertNotNull(testObject);
	}

	@Test
	public void testGetEmployeeId()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testFirstName()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testLastName()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testFullName()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetDepartment()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetDepartment()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnnualSalary()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testRaiseSalary()
	{
		fail("Not yet implemented");
	}

}
