package functions;

public class Function1 {

	public static void main(String[] args) {
		// call a function
     sum();
     
	}
	//public   //static  //void 
	//private  //No keyword(non-static)  //any datatype(primitive + non-primitive)  //Anything except
    //protected                                                                     //reserved keywords
	//public= access modifier, static= nature of method , void=return type , sum=method name , ()= parameters
	
	public static void sum()
    {
    	int a=10;
    	int b=20;
    	
    	System.out.println(a+b);
    	
    	int c=30;
    	System.out.println(c+b);
    	
    	int d=40;
    	System.out.println(c+d);
    }
}
