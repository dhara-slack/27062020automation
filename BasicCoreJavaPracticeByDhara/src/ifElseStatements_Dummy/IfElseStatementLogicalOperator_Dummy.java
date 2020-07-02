package ifElseStatements_Dummy;

public class IfElseStatementLogicalOperator_Dummy {

	public static void main(String[] args) {
		
		int age=18;
		float percentage=70.0f;
		int cart_count=5;
		double order_total=1000.0;

		if(age>=18 && percentage>60.0f)
		{
			System.out.println("Candidate is eligible for registration");
			
		}else
		{
			System.out.println("Candidate is not eligible");
		}
		
		if(cart_count>=5 || order_total>1000.0)
		{
			System.out.println("User is allowed to checkout");
		}
		else
		{
			System.out.println("User is not able to checkout");
		}
	}

}
