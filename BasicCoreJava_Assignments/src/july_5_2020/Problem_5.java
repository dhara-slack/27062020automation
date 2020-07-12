/* Write program to display following output
1
12
1234
12345
123456
1234567  
*/


package july_5_2020;

public class Problem_5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
