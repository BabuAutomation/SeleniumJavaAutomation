package Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class mergedArrays {

	public static void main(String[] args) {
		
		int [] arry1= {9,6,8,7,6,5,10};
		int[] arry2= {4,6,5,1,3,2,5};
		
		Set<Integer> set=new HashSet<Integer>();
		for(int num:arry1) {
			set.add(num);
		}
		for(int num:arry2) {
			set.add(num);
		}
		
		List<Integer> mergedlist=new ArrayList<Integer>(set);
				
		
		System.out.println("Merged arraylist: " + mergedlist);
		
		
	

	}

}
