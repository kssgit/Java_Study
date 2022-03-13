package Inflearn.Array;

import java.util.Scanner;

public class 보이는학생 {
	private static int solution(int[] arr) {
		
		int max = arr[0];
		int result = 1;
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result++;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
	}
}
