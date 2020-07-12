package functions;

public class AccessModifiers {

	public static void main(String[] args) 
	{
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
        obj.privateFunction();
        obj.defaultFunction();
        obj.protectedFunction();
        
	}
	
   //access within the class, package and project
   public void publicFunction()
   {
	//System.out.println("hello");   
   }
   
    //access within the class only
   private void privateFunction()
   {
	   //System.out.println("hello");
   }
   
   //access within the class and package
   void defaultFunction()
   {
	   
   }
   // access within the class and package
   //note: you can access it project level by using child class object
   protected void protectedFunction()
   {
	   System.out.println("hello123");   
   }
   
}
