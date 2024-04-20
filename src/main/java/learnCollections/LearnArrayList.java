package learnCollections;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
	List<Integer>Ist=new ArrayList<Integer>();
	Ist.add(20);
	Ist.add(30);
	Ist.add(40);
	Ist.add(40);
	Ist.add(60);
	Ist.add(70);
	Ist.add(50);
	Ist.add(80);
	Ist.add(90);
	Ist.add(10);
	System.out.println(Ist); //maintain insertiong order
	System.out.println("...................................");
	List<String>name = new ArrayList<String>();
	name.add("Eva");
	name.add("Tasneem");
	name.add("Nulufer");
	name.add("Mamun");
	name.add("Shah");
	name.add("Sarawer");
	name.add("abc");
	name.add("xyz");
	name.add("Eva");
	name.add("Tasneem");
	System.out.println(name);
	System.out.println("...................................................");
	System.out.println(name.size());//Get the count of list
	name.add("pqr");
	System.out.println(name);
	System.out.println(name.size());
	System.out.println("....................................................");
	 for(int i=3; i<name.size();i++) {
		 System.out.println(name.get(i));
	 }
	 System.out.println("...................................................");
 //Delete particular item from the list
System.out.println(name.remove(3));	
//verifying particular Item in the List-true/false
System.out.println(name.contains("abc"));
//Clear the list
name.clear();
//Confirm/Verify the list is Empty-true/flase
System.out.println(name.isEmpty());
System.out.println("..................................................");

	
		
			
					
	
	
	
	}

}
