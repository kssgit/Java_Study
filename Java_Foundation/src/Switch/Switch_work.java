package Switch;

import java.util.Scanner;

public class Switch_work {
	public static void main(String[] args) {
		//7월은 31일 까지 있습니다.
		//
		Scanner sc=new Scanner(System.in);
		System.out.print("월 : ");
		int month= sc.nextInt();
		
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println(month +"월은 31일 까지 있습니다.");
			break;
		case 2:
			System.out.println("2월은 28일 까지 있습니다.");
			break;

		case 4:case 6:case 9:case 11:
			System.out.println(month + "월은 30일 까지 있습니다.");
			break;
			
		default :
			System.out.println(month+ "월은 존재하지 않습니다 ");
		}
	}
}
