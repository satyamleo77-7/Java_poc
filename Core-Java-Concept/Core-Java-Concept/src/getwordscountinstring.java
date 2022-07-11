import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class getwordscountinstring {
public static void main(String[] args) {

	
	String str="Lorem ipsum dolor sit amet, consectetur adipiscing elit\r\n"
			+ ", sed do eiusmod tempor incididunt ut labore et dolore\r\n"
			+ "magna aliqua. Ut enim ad minim veniam, quis nostrud\r\n"
			+ "exercitation ullamco Lorem nisi ut aliquip ex ea\r\n"
			+ "commodo consequat. Duis aute irure dolor in reprehenderit\r\n"
			+ "in voluptate velit esse cillum dolore eu fugiat nulla pariatur\r\n"
			+ ". Excepteur sint occaecat cupidatat non proident,\r\n"
			+ "sunt in culpa qui officia deserunt mollit anim id est laborum";
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	 String[] out = str.split(" ");
	 List<String> list = Arrays.asList(out);
	Arrays.stream(out).map(e->map.put(e, map.containsKey(e)? map.get(e)+1:1)).collect(Collectors.toList());
	map.forEach((k,v)->System.out.println(k+"  "+v));
}
	
}
