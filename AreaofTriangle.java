package Harish123;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner at=new Scanner(System.in);
		System.out.println("Enter the Area of Triangle");
		double a=at.nextDouble();
		System.out.println("Enter width of Triangle");
		double w=at.nextDouble();
	double	area=(a*w)/2;
	System.out.println(area);
	at.close();
		

	}

}
