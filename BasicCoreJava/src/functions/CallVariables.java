package functions;

public class CallVariables {

	public static void main(String[] args) {
		
		Variables ref= new Variables();
		
		//change the values
		ref.name="Anjali";
		ref.name2 = "Sonam";
		
		// create a new object
		Variables ref2= new Variables();
		
		//call all the variables again
		System.out.println(ref2.name);
		System.out.println(ref.name);
		
		
		System.out.println(ref2.name2);
		System.out.println(ref.name2);
		
	}

}
