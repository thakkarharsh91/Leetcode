package easy;

import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimiter {
	private Map<String, Integer> map;
	
	public static void main(String[] args) {
		LoggerRateLimiter lrl = new LoggerRateLimiter();
		System.out.println(lrl.shouldPrintMessage(1, "hello"));
		System.out.println(lrl.shouldPrintMessage(11, "hello"));
	}

	public LoggerRateLimiter() {
		map = new HashMap<>();
	}

	public boolean shouldPrintMessage(int timestamp, String message) {
		if(map.containsKey(message) && timestamp - map.get(message) < 10) 
			return false;
		map.put(message, timestamp);
		return true;
	}
}
