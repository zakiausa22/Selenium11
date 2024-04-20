package learnCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//HashSet-CLASS   //Hashset generate Random output/not maintain order 
		
		Set<Integer>obj =new HashSet<Integer>();
	//	1. add items in Set-use add()
		obj.add(123);
		obj.add(345);                      
		obj.add(678);
		obj.add(888);
		obj.add(755);
		obj.add(3452);
		obj.add(1234);
		obj.add(000);
	//2.Get count of Set-use size()
		System.out.println(obj.size());
	//3. Print/display all items in the Set- use for each loop
		 for (Integer eachobj : obj) {
			 System.out.println(eachobj);
			 
			
		}
System.out.println(".................................................");	
   // 4. Check Particular item from set -use contains()----output comes  in consoleTrue or False
            System.out.println(obj.contains(1234));
            System.out.println(obj.contains(4321));
            System.out.println("..............................................");
   // 5. delete item from set-use remove (item)
            obj.remove(755);
            System.out.println(obj.contains(755));// why console  show false
            System.out.println(".............................................");
   // 6.After delete -Print all item from set- use for each loop
           for (Integer eachobj : obj) {
        	   System.out.println(eachobj);
			
		}
           System.out.println("...................................................");
    // 7.After delete item
           System.out.println(obj.size());
           System.out.println(".....................................................");
    // 8. Remove all items from set--use obj.clear()
           obj.clear();
    // 9. Confirm Set is Empty or not-use Empty()-- output comes in console true\flase
           System.out.println(obj.isEmpty());
           System.out.println("......................................................");
           
       //    TreeSet--CLASS--Maintain Ascending order output
           Set<Integer> ids= new TreeSet<Integer>();
//       	1. add items in Set-use add()
   		ids.add(123);
   		ids.add(345);                      
   		ids.add(678);
   		ids.add(888);
   		ids.add(755);
   		ids.add(3452);
   	//2.Get count of Set-use size()
   			System.out.println(ids.size());
   		//3. Print/display all items in the Set- use for each loop
   			 for (Integer eachids : ids) {
   				 System.out.println(eachids);
           
           

	}
   			 System.out.println("............................................");
        //   Linked HashSet--CLASS--Maintain Inserting order 
   			 Set<Integer>id =new LinkedHashSet<Integer>();
   		//	1. add items in Set-use add()
   	   		id.add(123);
   	   		id.add(345);                      
   	   		id.add(678);
   	   		id.add(888);
   	   		id.add(755);
   	   		id.add(3452);
   	   	//2.Get count of Set-use size()
   	   			System.out.println(id.size());
   	   		//3. Print/display all items in the Set- use for each loop
   	   			 for (Integer eachid : id) {
   	   				 System.out.println(eachid);
   			 
   			 
}
}
}