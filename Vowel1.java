package PatternPrgm;

import java.util.Scanner;

public class Vowel1 {
	int i=0;

	public static void main(String[] args) {
		Scanner vw=new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch=vw.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' ||ch=='E'||ch=='I'||ch=='O' ||ch=='U')
		{
			System.out.println("Entered Charactered "+ch+" is vowel");
			
		}
			
		else 
			System.out.println("Entered Characterd "+ch+" is Consant");
		
		}	

	}


