package Actions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Longestconsecutiveseq {
	
	public static List<Integer> longestconsecutiveseq(int[]nums){
		HashSet<Integer> set=new HashSet<Integer>();
		for(int num:nums) {
			set.add(num);
		}
		int longest=0;
		List<Integer> longestseq=new ArrayList<Integer>();
		for(int num:set) {
			if(!set.contains(num-1)) {
				int currentnum=num;
				int length=1;
				List<Integer> currentseq=new ArrayList<Integer>();
				currentseq.add(num);
				while(set.contains(currentnum+1)) {
					currentnum++;
					length++;
					currentseq.add(currentnum);
				}
				if(length>longest) {
					longest=length;
					longestseq=currentseq;
				}
			}
		}
		return longestseq;
	}
	
		public static void main(String[] args) {
			
			int [] array= {45,60,9,6,5,4,7,3};
			List<Integer> result=longestconsecutiveseq(array);
			System.out.println("Longestcinsecutiveseq:" +result);
			System.out.println("Length:" + result.size());
		}
}