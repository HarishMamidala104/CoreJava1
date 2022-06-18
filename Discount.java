package Harish123;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the Marketprice");
	double marketprice=d.nextDouble();
	
		System.out.println("Enter Discount");
		double discount=d.nextDouble();
		double s=100-discount;
		double amount=(s*marketprice)/100;
		System.out.println(amount);
		d.close();

	}

}
