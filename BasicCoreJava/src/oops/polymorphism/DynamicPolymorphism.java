package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		//reference               //object
		//Smartphone obj =          new Smartphone();
		
		
		
		Telephone obj4 = null;
		String browserName="Chrome";
		
		if(browserName.equals("Chrome"))
		{
			obj4 = new Mobile();  //Chrome
			
		}else if(browserName.equals("Firefox"))
		{
			obj4 = new Smartphone(); // firefox
		}
		//Script calling
		obj4.calling();
		
	}

}
