package Switch;

import java.util.Scanner;

public class Switch_work {
	public static void main(String[] args) {
		//7���� 31�� ���� �ֽ��ϴ�.
		//
		Scanner sc=new Scanner(System.in);
		System.out.print("�� : ");
		int month= sc.nextInt();
		
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println(month +"���� 31�� ���� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("2���� 28�� ���� �ֽ��ϴ�.");
			break;

		case 4:case 6:case 9:case 11:
			System.out.println(month + "���� 30�� ���� �ֽ��ϴ�.");
			break;
			
		default :
			System.out.println(month+ "���� �������� �ʽ��ϴ� ");
		}
	}
}
