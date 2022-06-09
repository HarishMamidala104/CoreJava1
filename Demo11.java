package Harish123;

import java.util.Scanner;

public class Demo11 {
	public static int sum(int A,int B) {
		return A*B;
		
	}

	public static void main(String[] args) {
		Scanner add=new Scanner(System.in);
		System.out.println("Enter A value");
		int A=add.nextInt();
		System.out.println("Enter B value");
		int B=add.nextInt();
		System.out.println( sum(A,B));
		add.close();

	}

}
