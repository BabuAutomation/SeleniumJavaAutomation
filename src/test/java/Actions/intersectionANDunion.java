package Actions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersectionANDunion {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2=Arrays.asList(3,4,5,6,7,8);
		
		Set<Integer> union=new HashSet<Integer>(list1);
			union.addAll(list2);
		Set<Integer> intersection=new HashSet<Integer>(list1);
			intersection.retainAll(list2);
			
			System.out.println("Union is: " + union);
			System.out.println("Intersection is: " + intersection);

	}

}
