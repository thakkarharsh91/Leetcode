package easy;

import java.util.Arrays;

public class Mergeoneanother {
	
	public static void main(String[] args) {
		int[] a1 = new int[4];
		int[] a2 = new int[2];
		a1[0] = 1; a1[1] = 5;
		a2[0] = 2; a2[1] = 4;
		mergeOneAnother(a1,a1.length,a2,a2.length);
	}

	private static void mergeOneAnother(int[] a1,int m, int[] a2, int n) {
		int k=m+n-1;
        int i=m-1;
        int j=n-1; 
		while(i >= 0 && j >= 0){
			if(a1[i] > a2[j]){
				a1[k--] = a1[i--];
			}
			else{
				a1[k--] = a2[j--];
			}
				
		}
		while(j >= 0){
			a1[k--] = a2[j--];
		}
		System.out.println(Arrays.toString(a1));
	}

}
