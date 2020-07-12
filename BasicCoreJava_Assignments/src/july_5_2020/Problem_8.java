package july_5_2020;

public class Problem_8 {

	public static void main(String[] args) {

		int max = 0;
		int[] arr = { 10, 20, 5, 40, 30 };

		for (int i = 0; i < 5; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
		}
		System.out.println("maximum value is : " + max);
	}

}
