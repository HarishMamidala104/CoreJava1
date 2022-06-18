package AssignmentOne;

import java.util.Scanner;

/**
 * Define a static Method that computes the age in terms of years and months for a given birthMonth and birthYear of a person.

Calculate and return the age as a decimal number with precision up to a max of 2 decimal places by referring following example.

Example:

if the age is 15 years and 6 months, then the output should be 15.5
if the age is 20 years and 3 months, then the output should be 20.25
Write the method with the following specifications

Name of method : calculateAge
Arguments : 2 integers (birthMonth, birthYear)
Return Type : double

Return -1.0 if any input is negative.
Return -2.0 if input is greater than current month and year.
Return age as per above the example, if input is correct.
 * @param args
 */

public class AssignmentOne {
	
	static int birthYear;
	static double birthMonth;
	static int currentYear;
	static double currentMonth;
	static double age;
	static double result2;
	static double result;
	
	public static double calculateAge(double birthMonth,double birthYear)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  BirthYear :");
		birthYear=sc.nextInt();
		System.out.println("Enter the  CurrentYear :");
		currentYear=sc.nextInt();
		System.out.println("Enter the  BirthMonth :");
		birthMonth=sc.nextDouble();
		System.out.println("Enter the  CurrentMonth :");
		currentMonth=sc.nextDouble();
		
		
		result =currentYear - birthYear;
		
		if(currentMonth>birthMonth) {
			result2=  currentMonth-birthMonth;
			age=result + ((result2)/12);
		}
		else {
			result2 = birthMonth- currentMonth;
			age=result + ((result2)/12);
		}
	
		return age;
	
	}
	public static void main(String[] args) {
				
		System.out.println(calculateAge(birthMonth,birthYear));	
		
	}

}
