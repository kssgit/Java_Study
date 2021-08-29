package Work;

import java.util.*;



public class PG가장큰수 {
	public static void main(String[] args) {
		
	}

	public String solution(int[] numbers) {
		String answer = "";
        //문자열 리턴을 해줄 스트링배열 생성
        String[] str = new String[numbers.length];
        
        //int배열 String배열로 변환
        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }   
      
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
/*
 Integer x = 3; 
 Integer y = 4; 
 Double z = 1.0; 
 System.out.println( x.compareTo(y) ); // -1 
 System.out.println( x.compareTo(3) ); // 0 
 System.out.println( x.compareTo(2) ); // 1 
 System.out.println( z.compareTo(2.7) ); // -1

 */
                
            }
        });
        // Arrays.sort(정렬할 배열 , 
        
        if(str[0].equals("0"))return "0";
		for(String s : str)answer+=s;
		return answer;
	}

}
