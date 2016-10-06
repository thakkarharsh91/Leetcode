package easy;

import java.util.HashMap;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "abccccdd";
		System.out.println(LongestPalindrome.longestPalindrome(s));
	}
	
	public static int longestPalindrome(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        int result = 0;
        boolean flag = false;
        for (Integer num : hashMap.values()) {
            if (num % 2 != 0) {
                result += num - 1;
                flag = true;
            } else {
                result += num;
            }
        }
        if (flag) {
            result++;
        }
        return result;
    }
}
