package Data_Structure;

import java.util.Arrays;

public class 배열 {
	public static void main(String[] args) {
		int[] arr =new int[7];
		int[][] arr2 = new int[3][4];
		arr[0]=1;
		//배열 출력
		//2차원 배열 출력
		System.out.println(Arrays.deepToString(arr2));	//2차원 배열 확인하는법
		//1차원 배열
		System.out.println(Arrays.toString(arr)); //일차원 배열 확인하는법
	}
}
