package BasicCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeNames {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<String>employeeNames = new ArrayList<String>();
		employeeNames.add("John");
		employeeNames.add("Sue");
		employeeNames.add("Paul");
		employeeNames.add("Susanne");
		employeeNames.add("Todd");
		
		
		Set<Integer>ids = new HashSet<Integer>();
		ids.add(11236);
		ids.add(13756);
		ids.add(1236);
		ids.add(199045);
		ids.add(12599);


		List<Integer> empId = new ArrayList<>(ids);
	
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		for(int g = 0; g < employeeNames.size(); g++)
		{
			System.out.println(employeeNames.get(g));
			employeeMap.put(empId.get(g), employeeNames.get(g));
		}
	
		
		int i = 0;
		
		for (Integer id : ids) {

			employeeMap.put(id, employeeNames.get(i));
			i++;
		}

		// // using for-each loop for iteration over Map.entrySet() 

        for (Map.Entry<Integer,String> entry : employeeMap.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
				
		// //System.out.println(employeeMap);
		// //System.out.println("The set is: " + employeeMap.keySet()); 
	
	}
		
}