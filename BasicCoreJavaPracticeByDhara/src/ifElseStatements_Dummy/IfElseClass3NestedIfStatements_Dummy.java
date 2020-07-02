package ifElseStatements_Dummy;

public class IfElseClass3NestedIfStatements_Dummy {

	public static void main(String[] args) {
		int a=5;
		int b=20;
		int c=100;
		
		if(a>b)
		{
			if(b>c)
			{
			System.out.println("a is greatest");
			}
		
		}else if(b>c)
			{
				if(c>a)
				{
				System.out.println("b is greatest");
			    }
		    }
		
		else
		{
			System.out.println("c is greatest");
		}
		
		
		
		
	  }
	
			

	


}


