package program;

import java.util.HashMap;
import java.util.Map;

public class numMap {
	public numMap() {
		String input = "1234415581";
		Map<Object, Object> dict = new HashMap<>();
		int counter = 0;
		for(int i = 0; i< input.length();i++) {
			for(int j = 0;j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) {
					counter++;
				}
			}
			dict.put(input.charAt(i),counter);
			counter = 0;
		}
		System.out.println(dict.get('1'));
		System.out.println(dict);
	}
}
