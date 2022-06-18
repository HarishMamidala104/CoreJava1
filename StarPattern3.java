package Harish123;

public class StarPattern3 {

	public static void main(String[] args) {

		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else {
					
					System.out.print(i+" ");
				}	
			}
			System.out.println();
		}

	}

}
