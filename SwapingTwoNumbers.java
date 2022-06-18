package Harish123;

import java.util.Scanner;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Enter a Value");
		int a=sw.nextInt();
		System.out.println("Enter B Value");
		int b=sw.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
				System.out.println("After Swaping  A=" +a);
				System.out.println("After Swaping B=" +b);
				sw.close();
		

	}

}
