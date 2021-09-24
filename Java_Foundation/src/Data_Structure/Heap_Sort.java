package Data_Structure;

import java.util.PriorityQueue;

public class Heap_Sort {
	public static void main(String[] args) {
		int[] arr = {3, 7, 5, 4, 2, 8};
		System.out.print(" 정렬 전 original 배열 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		//우선순위 큐 
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		// 배열을 최소힙으로 만든다. / 최대힙은 -값으로 변환 후 넣어준다
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		
		// 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 뽑는다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		
		
		System.out.print("\n 정렬 후 배열 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}

	}
}
