package 백준;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Word implements Comparable<Word>{
	String word ;
	int num ;
	public Word(String word , int num) {
		this.num = num;
		this.word = word;
	}
	
	@Override
	public int compareTo(Word o) {
		// TODO Auto-generated method stub
		return this.word.compareTo(o.word);
	}
}

public class BJ1755_숫자놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		ArrayList<Word> result = new ArrayList<>();
		//0~9 
		String[] arr= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i = M ; i <= N ; i++) {
			String tmp = Integer.toString(i); // "10"
			char[] ch = tmp.toCharArray();// [1,0]
			
			StringBuilder sb = new StringBuilder(); //문자열 추가 가능한 String 클래스 
			
			for(int j =0 ; j<ch.length;j++) {
				sb.append(arr[ch[j]-'0']);
				//10 이상인 값들은 빈칸 추가
				if(ch.length >1 ) {
					sb.append(" ");
				}
			}
//			System.out.println(sb.toString());
			result.add(new Word(sb.toString(), i));
		}
		
		//list 정렬
		Collections.sort(result);
		
		//출력
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i).num+" ");
			if((i+1)%10==0) {//10개를 출력한 후에는 줄바꿈 
				System.out.println();
			}
			
		}
		
	}
}
