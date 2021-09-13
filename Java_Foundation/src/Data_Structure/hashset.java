package Data_Structure;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("red");
		set.add("blue");
		set.add("red");
		set.add("orange");
		set.add("black");
		
		System.out.println(set);
		if(set.isEmpty())
			System.out.println("empty");
		set.remove("black"); 
		
		System.out.println(set);
	}
}
