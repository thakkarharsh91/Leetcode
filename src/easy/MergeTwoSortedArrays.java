package easy;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	public static void main(String[] args) {
		int[] a1 = {1,3,5,7};
		int[] a2 = {2,4,6,8};
		merge(a1,a2);
	}

	private static void merge(int[] a1, int[] a2) {
		int i=0,j=0,k=0;
		int[] result = new int[a1.length + a2.length];
		while(i < a1.length && j < a2.length){
			if(a1[i] < a2[j])
				result[k++] = a1[i++];
			else
				result[k++] = a2[j++];
		}
		
		while(i < a1.length)
			result[k++] = a1[i++];
		while(j < a2.length)
			result[k++] = a2[j++];
		
		System.out.println(Arrays.toString(result));
	}

}
