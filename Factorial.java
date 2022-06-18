package Harish123;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		Scanner fc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=fc.nextInt();
		int i=1;
while(n>=i)
{
	fact=fact*i;
i++;

}
System.out.println(fact);
fc.close();

	}
	

}
