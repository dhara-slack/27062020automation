package collection;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class Students {

	public static void main(String[] args) {
		String name ="Dhara";
		
		String[] std= new String[18];
        
		// 10, true , Dhara
		new Smartphone();
		new Mobile();
		new Telephone();
		
		Object phone=  new Smartphone();
		
		Object a=10;
        Object b=true;
        Object c="Dhara";
        
        Object[] arr=new Object[3];
        arr[0]=10;
        arr[1]= true;
        arr[2]="Dhara";
        
	}

}
