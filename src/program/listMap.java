package program;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class listMap {
	public listMap() {
		String input = "1234415581";
		Map<Object, ArrayList<Object>> dict = new HashMap<>();
		for(int i = input.length()-1; i>= 0;i--) {
			ArrayList<Object> tempStore = new ArrayList();
			for(int j = input.length()-1; j>= 0;j--) {
				if(input.charAt(i)==input.charAt(j)) {
					tempStore.add(input.charAt(i));
				}
			}
			dict.put(input.charAt(i),tempStore);
		}
		System.out.println(dict.get('1').size());
		System.out.println(dict);
		
	}
}
