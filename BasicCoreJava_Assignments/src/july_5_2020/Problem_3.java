/* Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, it prints 'divisible by 5 
followed by that number' */

package july_5_2020;

public class Problem_3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			
			if(i%5==0) 
			{
		      
				System.out.println("divisible by 5 followed by that number : "+i);
			
		    }
			
			
	     }

	}

}
