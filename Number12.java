package Harish123;

import java.util.Scanner;

public class Number12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the N values");
		int N=n.nextInt();
		for(int N1=1;N1<=N;N1++) {
		if(N%2==0)
		{
			System.out.println("Even=" +N);
		}
		else {
			System.out.println("Odd=" +N);
		}
		if(N==0)
		{
			System.out.println("Number of Zero= " +N);
		}
		
		
		if(N>0)
		{
			System.out.println("Given Numbers is positive="+N);
		}
		else {
			System.out.println("Given Numbers is Negitive="+N);
		}
		n.close();
		}

	}

}
