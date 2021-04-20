package BasicCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LastNamesStartWithA {

    public static void main(String[] args) {

		/*
		 * Map<K,V> where k is the key, V is the value. keys cannot have duplicates but
		 * values can. namesList is the Map, name is the key (cannot have duplicates),
		 * firstLetter is the value .
		 */

		Map<String, String> namesList = new HashMap<String, String>();
		namesList.put("Avery", "A");
		namesList.put("Bloom", "B");
		namesList.put("White", "W");
		namesList.put("Anderson", "A");
		namesList.put("Gray", "G");

		System.out.println("Names List: " + namesList);

//			if you need the key set, you use .  we're grabbing a collection of all the keys:
		Set<String> names = namesList.keySet();
		for (String name : names) {
			// to see the keys, we're iterating over the key set
			System.out.println(namesList.get(name) + " is the value for the key " + name);
		}
//			if you need the values, use . to iterate over the . returns collection 
		//Collection<String> namesStartingWithA = namesList.keySet();
        List<String> namesStartingWithA = new ArrayList<String>();

		for (String name : names) {
			//System.out.println("The first letter is " + namesList.get(name) + " for the name(s): " + name);
            if(namesList.get(name) == "A")
            {
                namesStartingWithA.add(name);
            }
	
		}
		 
	
		System.out.println("The names starting with A are: " + namesStartingWithA);
	}
    
}
