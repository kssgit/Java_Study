package Inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기 {
	private static ArrayList<Integer> solution(int[] arr ) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int a = 0; 
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > a) {
				result.add(arr[i]);		
			}
			a=arr[i];
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
		for(int a : solution(arr)) {
			System.out.print(a);
			System.out.print(" ");
		}
	}
}
