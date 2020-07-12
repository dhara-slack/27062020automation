package loops;

public class Assignment_6 {

	public static void main(String[] args) {
		// TASK 1 : create an array to store fruits name
		// TASK 2 :to store prices
		// TASK 3 :to store excel values(10X5)
		// for read
		
		String[] fruit= {"Apple","Grapes","Pears","Mango","Litchi"};
		
		int[] f_Price= {49, 67, 90, 123,342};
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Fruit name = " +fruit[i]+ " and Fruit's price = "+f_Price[i]);
			//System.out.println(fruit[i]);
			//System.out.println("Fruit's price="+f_Price[i]);
		}

	}

}
