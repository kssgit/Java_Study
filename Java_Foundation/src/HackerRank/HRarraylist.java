package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HRarraylist {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> arr2d = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < n ; i++) {
        	st = new StringTokenizer(br.readLine());
        	ArrayList<Integer> arr = new ArrayList<Integer>();
        	int a = Integer.parseInt(st.nextToken());
        	for(int j = 0 ; j < a ; j++) {
        		int b = Integer.parseInt(st.nextToken());
        		arr.add(b);
        	}
        	arr2d.add(arr);
        }
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        System.out.println(arr2d.toString());

        for(int i = 0 ; i < n ; i++) {
        	st = new StringTokenizer(br.readLine()); 
        	int a = Integer.parseInt(st.nextToken())-1;
        	int b = Integer.parseInt(st.nextToken())-1;
        	try {
        		System.out.println(arr2d.get(a).get(b));
        	}catch(IndexOutOfBoundsException e){
        		System.out.println("ERROR!");
        	}
        }
        
	}
}
