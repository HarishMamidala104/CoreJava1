package Harish123;

import java.util.Scanner;

public class Multification1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner multification=new Scanner(System.in);
System.out.println("Enter the N value");
int N=multification.nextInt();
for(int i=1;i<=10;i++)
{
//int result=	N*i;
//System.out.println(result);
System.out.println(N + "*" + i + " = " + (N * i));
}
multification.close();
}
	}



