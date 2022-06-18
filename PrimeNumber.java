package Harish123;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=2;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=p.nextInt();
		while(true)
		{
		if(n==1) {
			System.out.println("smallest prime number is 2");
			break;
		}
		if(n%i==0)
		{
		break;	
		}
		else {
			i++;
		}
		}
		if(n==i)
		{
			System.out.println("The given number is prime"+n);
		}
		else {
			System.out.println("The given number is not Prime :"+n);
		}
		p.close();
		}

	
	}


