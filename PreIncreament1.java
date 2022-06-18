package Harish123;

import java.util.Scanner;

public class PreIncreament1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=43;
		System.out.println((++a)+(a++)+(b++)+(--b)+(++a)+(a=b)+(b=a)+(--a)+(++b)+(b--));
		int reverse=0,rem;
		Scanner pi=new Scanner(System.in);
		System.out.println("Enter N value");
		int N=pi.nextInt();
		pi.close();
		while(N>0)
		{
			rem=N%10;
			reverse=reverse*10+rem;
			N=N/10;
			
			
		}
System.out.println(reverse);
	}

}
