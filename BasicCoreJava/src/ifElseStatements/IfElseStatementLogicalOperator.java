package ifElseStatements;

public class IfElseStatementLogicalOperator {

	public static void main(String[] args) {
		
		int age=25;
		boolean voterID=true;
		
		if(age>=25 && voterID)
		{
			System.out.println("you are eligible");
		}
		
		else
		{
			System.out.println("not eligible");
		}
		
		// OR operator
		
		boolean panCard=true;
		boolean aadharCard=true;
		
		if(panCard || aadharCard)
		{
			System.out.println("you are eligible");
		}
		
		else
		{
			System.out.println("not eligible");
		}
	}

}
