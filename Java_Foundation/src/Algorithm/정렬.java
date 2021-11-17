package Algorithm;

public class 정렬 {
	public static void main(String[] args) {
		int[] arr = {7,5,2,9,4,10,1};
		
		System.out.println("버블 정렬");
		for(int w : 버블(arr)) {
			System.out.println(w);
		}
	}
	static int[] 버블(int[] arr) {
		//시간 복잡도 O(n^2)
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 1 ; j < arr.length;j++) {
				int b = arr[j];
				int f = arr[j-1];
				if(f > b) {
					arr[j]=f;
					arr[j-1]=b;
				}
			}
		}
		return arr;
	}
	
	static int[] 선택(int[] arr) {
		return arr;
	}
	
	static int[] 삽입(int[] arr) {
		return arr;
	}
	
}
