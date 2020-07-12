package functions;

public class Function2 {
    public static String name="jugal";
    
	public static void main(String[] args) {
		/*sum(10,20);
		sum(30,40);
		sum(70,80);
		sum(10,30,60);
        message("dhara");
        eligibility("dhara",25);
        eligibility("priya",17); */
		
		System.out.println(name);  // calling static variable here
	}

	
	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void message(String name)
	{
		System.out.println("Welcome " +name);
	}
	
	public static void eligibility(String name, int age)
	{
		//put some logic
		System.out.println("dhara you are eligible");
		System.out.println("priya  you are not eligible");
	}
	
}
