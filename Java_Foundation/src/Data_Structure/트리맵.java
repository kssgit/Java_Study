package Data_Structure;

import java.util.TreeMap;

public class 트리맵 {
	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>(){{//초기값 설정
		    put(1, "사과");//값 추가
		    put(2, "복숭아");
		    put(3, "수박");
		}};
		
		/*
		 * TreeMap은 이진트리를 기반으로 한 Map 컬렉션입니다. 
		 * 같은 Tree구조로 이루어진 TreeSet과의 차이점은 TreeSet은 그냥 값만 저장한다면 
		 * TreeMap은 키와 값이 저장된 Map, Etnry를 저장한다는 점입니다. 
		 * TreeMap에 객체를 저장하면 자동으로 정렬되는데, 키는 저장과 동시에 자동 오름차순으로 정렬되고 
		 * 숫자 타입일 경우에는 값으로, 문자열 타입일 경우에는 유니코드로 정렬합니다. 
		 * 정렬 순서는 기본적으로 부모 키값과 비교해서 키 값이 낮은 것은 왼쪽 
		 * 자식 노드에 키값이 높은 것은 오른쪽 자식 노드에 Map.Etnry 객체를 저장합니다. 
		 * TreeMap은 일반적으로 Map으로써의 성능이 HashMap보다 떨어집니다. 
		 * TreeMap은 데이터를 저장할 때 즉시 정렬하기에 추가나 삭제가 HashMap보다 오래 걸립니다. 
		 * 하지만 정렬된 상태로 Map을 유지해야 하거나 정렬된 데이터를 조회해야 하는 범위 검색이 필요한 경우 
		 * TreeMap을 사용하는 것이 효율성면에서 좋습니다.
		 */
		
		System.out.println(map); //전체 출력 : {1=사과, 2=복숭아, 3=수박}
		System.out.println(map.get(1));//key값 1의 value얻기 : 사과
		System.out.println(map.firstEntry());//최소 Entry 출력 : 1=사과
		System.out.println(map.firstKey());//최소 Key 출력 : 1
		System.out.println(map.lastEntry());//최대 Entry 출력: 3=수박
		System.out.println(map.lastKey());//최대 Key 출력 : 3
		
		
	}
}	
