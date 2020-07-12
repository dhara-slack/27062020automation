package collection;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<String> set= new TreeSet<>();
		
		set.add("Puja");
		set.add("Babli");
		set.add("Nishta");
		set.add("Puja");
		
		/*for(String p:set)
		{
			System.out.println(p);
		}*/
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
