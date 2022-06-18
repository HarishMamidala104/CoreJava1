package Harish123;

public class Arrays11 {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=12;
		a[1]=14;
		a[2]=16;
		a[3]=11;
		a[4]=20;
		for(int i=0;i<=a.length;i++) {
			//System.out.println(a[i]);
			if(a[i]==a[2])
			{
				System.out.println(a[0]);
			}
			if(a[i]%2==0) {
				System.out.println("Even number="+a[i]);
				
			}
			else {
				System.out.println("Not Even Number="+a[i]);
				
			}
			
		}

	}

}
