package Harish123;

import java.util.Scanner;

public class Radiusproblem {

	public static void main(String[] args) {
		Scanner io =new Scanner(System.in);
		System.out.println("Enter the radius and area");
		double radius=io.nextDouble();
		System.out.println("perimeters is="+(2*radius*Math.PI));
		System.out.println("Area is ="+(Math.PI*radius*radius));
		System.out.println("*******************************");
		io.close();
		int x=10;
		int y=20;
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swaping X value:"+x);
		System.out.println("After swaping y value:"+y);

	}

}
