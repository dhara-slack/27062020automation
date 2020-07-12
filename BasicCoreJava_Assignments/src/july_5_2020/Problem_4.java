//Write a for loop to find the sum of first 100 numbers(1 to 100)

package july_5_2020;

public class Problem_4 {

	public static void main(String[] args) {
		int SUM=0;
		int number=100;
    //for(int i=1;i<=100;i++)
    {
    	//SUM = (SUM+i);
    	
    	SUM = (number*(number+1))/2;
   }
    System.out.println("Sum of first 100 numbers : " + SUM);
	}

}


