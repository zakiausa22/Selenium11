package learnCollections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
	
	//Create a  10 employees id & name  firstname and lastname of a company using LinkedHashMap and implement all method of the map.
	//OR create students name & id
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		mp.put("Eva", 100);
		mp.put("Shah", 200);
		mp.put("Nulufar",300);
		mp.put("Tasneem", 400);
		mp.put("Saor", 500);
		mp.put("Jon", 600);
		mp.put("APP", 700);
		mp.put("AAAa", 800);
		System.out.println(mp);
		System.out.println(mp.size());
		for (Entry<String, Integer>eachmp:mp.entrySet()) {
		System.out.println(eachmp.getKey() +" " + eachmp.getValue());	
		}
		
		
		
 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
