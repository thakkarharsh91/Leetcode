package easy;

public class Anagram {

	public static void main(String[] args) {
		String s ="harsh";
		System.out.println(Anagram.isAnagram(s, "rahhs"));;
	}
	
	public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(int i =0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i =0;i<t.length();i++){
            arr[t.charAt(i) - 'a']--;
        }
        for(int i : arr)
        	if(i!=0)
        		return false;
        return true;
    }
}
