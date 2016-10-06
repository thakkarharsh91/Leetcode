package easy;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] a1 = {1,2,2,1,3};
		int[] a2 = {2,2,3};
		System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersection(a1, a2)));
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        int[] result = new int[set.size()];
        int count = 0;
        for(int i =0;i<nums1.length;i++){
            if(set.contains(nums1[i])){
                result[count++] = nums1[i];
                set.remove(nums1[i]);
            }
        }
        return Arrays.copyOf(result, count);
    }
}
