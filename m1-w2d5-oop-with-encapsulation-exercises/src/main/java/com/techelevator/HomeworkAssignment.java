package com.techelevator;

public class HomeworkAssignment
{

	// Instance variables

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	//Constructor
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	/**
	 * Takes possible marks and marks earned
	 * @return final score in letter-grade format
	 */
	public String getLetterGrade()
	{
		double score = ((totalMarks * 100.0) / possibleMarks);
		if (score >= 90)
		{
			return "A";
		}
		else if (score < 90 && score >= 80)
		{
			return "B";
		}
		else if (score < 80 && score >= 70)
		{
			return "C";
		}
		else if (score < 70 && score >= 60)
		{
			return "D";
		}
		else
		{
			return "F";
		}
	}

	public int getTotalMarks()
	{
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks)
	{
		this.totalMarks = totalMarks;
	}

	public String getSubmitterName()
	{
		return submitterName;
	}

	public void setSubmitterName(String submitterName)
	{
		this.submitterName = submitterName;
	}

	public int getPossibleMarks()
	{
		return possibleMarks;
	}

	

}
