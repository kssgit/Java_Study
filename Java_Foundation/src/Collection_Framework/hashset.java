package Collection_Framework;

import java.util.HashSet;

public class hashset {
	//set : 순서 x, 중복 x
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
		set.remove("black"); //순서가 없기 떄문에 인덱스로는 제거할 수 없다.
		
		System.out.println(set);
	}
}
