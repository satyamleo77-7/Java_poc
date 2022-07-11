package Stream;

import java.util.HashMap;
import java.util.Map;

public class Removeevenfrequencycharacter {
	public static void main(String[] args) {
		String str = "shvhjcdsvhsjhdsjhjdhjsdbcjbjsbcc";
		String out = "";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		for (char c : str.toCharArray()) {
			if (map.get(c) % 2 == 0)
				continue;
				out += c;
		}
		System.out.println(out);
	}
}
