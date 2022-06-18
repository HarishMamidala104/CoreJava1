package Harish123;

import java.util.Scanner;

public class Basics {
	public static int sum(int i,int j) {
	
		return i + j;
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter A value");
		int A=input.nextInt();
		System.out.println("Enter the B value");
		int B=input.nextInt();
		System.out.println(sum(A, B));
		
		input.close();
		

	}

}
