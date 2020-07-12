package functions;

public class CallVariables2 {

	
public static void main(String[] args) {
		
		Variables2 ref= new Variables2();
		
		//change the values
		ref.name="aadi";
		ref.name2 = "jack";
		
		// create a new object
		Variables2 ref2= new Variables2();
		
		//call all the variables again
		System.out.println(ref2.name);
		System.out.println(ref.name);
		
		
		System.out.println(ref2.name2);
		System.out.println(ref.name2);
		
		/*System.out.println(ref2.name3);
		System.out.println(ref.name3);*/
		
	}
}
