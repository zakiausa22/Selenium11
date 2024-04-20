package learnCollections;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {

	public static void main(String[] args) {
		 List<String> names = new LinkedList<String>();
		    names.add("Eva");
			names.add("Tasneem");
			names.add("Nulufer");
			names.add("Mamun");
			names.add("Shah");
			names.add("Sarawer");
			names.add("abc");
			names.add("xyz");
			names.add("Eva");
			names.add("Tasneem");
			System.out.println(names);
		//	Get the count of the List
			System.out.println(names.size());
			System.out.println("......................................");
			names.add("PQR");
			System.out.println(names.size());
			System.out.println("........................................");
			//Print all items inside the list
			for(String eachNames:names) {
				System.out.println(eachNames);
			}
	System.out.println("..................................................");	
	//Delete the item from the list
	System.out.println(names.remove(1));
	System.out.println("...................................................");
	
			

	}

}
