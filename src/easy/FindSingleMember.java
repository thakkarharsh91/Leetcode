package easy;

import java.util.HashSet;
import java.util.Iterator;

public class FindSingleMember {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,2,1};
		System.out.println(FindSingleMember.singleNumber(arr));
	}

	public static int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for(int a : nums){
			if(!set.add(a))
				set.remove(a);
		}
		Iterator<Integer> it = set.iterator();
		return it.next();
	}
}
