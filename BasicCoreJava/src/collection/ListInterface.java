package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		
		list.add("Peehu");
		list.add("Jugal");
		list.add("Sonam");
		list.add("Peehu"); // as list allows duplicate entries
		
		for(String s: list)
		{
			System.out.println(s);
		}

	}

}
