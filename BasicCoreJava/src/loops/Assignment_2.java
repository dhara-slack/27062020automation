package loops;

public class Assignment_2 {

	public static void main(String[] args) {
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		
		for(int row=0;row<=5;row++)
		{
			for(int col=1;col<=5-row;col++)
			{
				System.out.print(col+" ");
				
			}
			  System.out.println();
		}
	}

}
