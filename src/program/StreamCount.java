package program;

import java.util.Arrays;
import java.util.List;

public class StreamCount {
	public StreamCount(){
		String input = "1234415581";
		List<String> meo = Arrays.asList(input.split(""));
		long x = meo.stream()
				.filter(s -> s.equals("1"))
				.count();
		System.out.println(x);
	}
}
