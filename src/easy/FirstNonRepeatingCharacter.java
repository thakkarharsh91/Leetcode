package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "aadadaad";
		System.out.println(firstUniqueChar(s));
	}

	private static int firstUniqueChar(String s) {
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		Set<Character> set = new HashSet<>();
		for(int i =0;i<s.length();i++){
			if(set.contains(s.charAt(i))){
				map.remove(s.charAt(i));
			}
			else{
				map.put(s.charAt(i), i);
				set.add(s.charAt(i));
			}
		}
		return map.size() == 0 ? -1 : map.entrySet().iterator().next().getValue();
	}
}
