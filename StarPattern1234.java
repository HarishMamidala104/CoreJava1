package PatternPrgm;
/**
 * StarPattern Number12
 * @author hm22101
 *
 */

public class StarPattern1234 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				if((j==1||j==n)||(i==1||i==n))
					
				
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
