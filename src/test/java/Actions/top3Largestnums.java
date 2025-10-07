package Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  class top3Largestnums {
	
	public static void main(String[] args)  {
		
		List<Integer> numbers=Arrays.asList(1,22,36,54,85,95,65,45,35,45,65,85,75,105,205);
		
		Set<Integer> uniqnum=new HashSet<Integer>(numbers);
		Integer first=null, second=null, third=null;
		
		for(int num:uniqnum) {
			if(first==null|| num>first) {
				third=second;
				second=first;
				first=num;
			}else if(second==null|| num>second) {
				third=second;
				second=num;
			}else if(third==null || num>third) {
				third=num;
			}
		}
		
		System.out.println("Top 3 uniq largest numbers: " + Arrays.asList(first, second, third));
		
		/* List<Integer> numbers = Arrays.asList(10, 20, 20, 5, 8, 50, 30, 50, 40);

        // Remove duplicates by using HashSet
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Convert back to list and sort in descending order
        List<Integer> sortedList = new ArrayList<>(uniqueNumbers);
        sortedList.sort(Collections.reverseOrder());

        // Get top 3 (if available)
        List<Integer> top3 = sortedList.subList(0, Math.min(3, sortedList.size()));

        System.out.println("Top 3 largest unique numbers: " + top3);*/
		
		
	}
			
}


