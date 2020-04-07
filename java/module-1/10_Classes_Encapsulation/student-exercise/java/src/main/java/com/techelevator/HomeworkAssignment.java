package com.techelevator;

public class HomeworkAssignment {
	
	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private int earnedMarks;
	
	private int possibleMarks;
	
	private String submitterName;
	

	
	//********************************************************************************************
	// Constructors for the class
	//********************************************************************************************	

	public HomeworkAssignment (int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	
	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getLetterGrade() {
		String letterGrade = "";
		double score = (double) earnedMarks / possibleMarks; // cast to a double to make sure the math works out
		if (score >= .90) {
			letterGrade = "A";
		}
		else if (score <= .89 && score >= .80) {	
			letterGrade = "B";
		}
		else if (score <=.79 && score >= .70) {	
			letterGrade = "C";
		}
		else if (score <= .69 && score >= .60) {	
				letterGrade = "D";
		}
		else if (score <= .59) {	
				letterGrade = "F";
		}
		return letterGrade;
	}
	//********************************************************************************************
	// Setters	- Allows users to change values
	//********************************************************************************************
	
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	
	
	
	
	
	
	
	
}
