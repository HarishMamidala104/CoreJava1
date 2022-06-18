package Harish123;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		System.out.println("Hello\n Harish mamidala");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first name");
		String first=input.next();
		System.out.println("Enter Last name ");
		String last=input.next();
		System.out.println("Hello\n"+first+" "+last);
		input.close();

	}

}
