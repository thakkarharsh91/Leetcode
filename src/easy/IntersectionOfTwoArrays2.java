package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays2 {

	public static void main(String[] args) {
		int[] a1 = {1,2,2,1,3};
		int[] a2 = {2,2,3};
		System.out.println(Arrays.toString(IntersectionOfTwoArrays2.intersection(a1, a2)));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<nums1.length;i++){
			if(map.containsKey(nums1[i]))
				map.put(nums1[i],map.get(nums1[i]) + 1);
			else
				map.put(nums1[i], 1);
		}
		for(int i=0;i<nums2.length;i++){
			if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
				list.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		int[] result = new int[list.size()];
		for(int i =0;i<list.size();i++){
			result[i] = list.get(i);
		}
		return result;
	}
}
