package ifElseStatements;

public class IfElseClass3NestedIfStatements {

	public static void main(String[] args) {
		
		int a=10;
		int b=200;
		int c=30;
		
		if(a>b)
		{
			if(b>c)
			{
			System.out.println("a is greatest");
			}
		
		}else
		{
			if(b>c)
			{
				if(c>a)
				{
				System.out.println("b is greatest");
			    }
				
		    }
			
		}
		
		

}
}