package Harish123;

public class PrimeNumber12 {

	public static void main(String[] args) {
		int m=2;
		int n=3;
		int count=-0;
		for(int i=m;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("Prime Number:");
		}
		else {
			System.out.println("Not prime :");
		}
	}

}
