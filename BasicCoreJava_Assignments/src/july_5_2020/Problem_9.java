package july_5_2020;

public class Problem_9 {

	public static void main(String[] args) {
		
		int[] arr = { 1, 20, 5, 40, 30 };
		int min= arr[0];
		for (int i = 0; i < 5; i++) {
			if (min > arr[i]) {
				min = arr[i];

			}
		}
		System.out.println("maximum value is : " + min);

	}

}
