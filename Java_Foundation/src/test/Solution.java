package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;


import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/*회사는 본사에서 컴퓨터에 대한 분석을 수행하고 있습니다.
 *  컴퓨터는 단일 행을 따라 간격을 두고 있습니다. 
 *  특정 길이의 각 연속 컴퓨터 그룹, 즉 각 세그먼트에 대해 컴퓨터에서 사용할 수 있는 최소 디스크 공간을 결정합니다. 
 *  이 값의 최대값을 답으로 반환하십시오.
*/
class Result {

    /*
     * Complete the 'segment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER x
     *  2. INTEGER_ARRAY space
     */

    public static int segment(int x, int[] space) {
    // Write your code here
    	int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < space.length ; i++){
        	int g = i+x-1;
            if(g<space.length){
                int min = Integer.MAX_VALUE ;
                for(int j = i ; j <= g ; j++){
                    min = Math.min(min, space[j]);
                }
                max =Math.max(max,min);
            }    
        }
        
        
        return max;
    }

}

public class Solution {
	public static void main(String[] args) throws IOException {
		
		int x = 2 ;
		int[] space = {8,2,4,6};
        int result = Result.segment(x, space);

        System.out.println(result);
	}
}
