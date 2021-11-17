package test;

import java.util.Arrays;

public class code1 {
	public static void main(String[] args) {
		int[] arr = {7,5,2,9,4,10,1};
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
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
 	}
}