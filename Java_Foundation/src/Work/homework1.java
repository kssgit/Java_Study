package Work;

import java.util.*;

public class homework1 {
	public static void main(String[] args){
//	�ұ� ���� ���� 
		Scanner scanner = new Scanner(System.in);
		System.out.println("T�� �Է��ϼ���");
		int t = scanner.nextInt();
		for(int i=1 ;i <=t ;i++) {
			System.out.println("�迭�� ũ�� N:");
			int n = scanner.nextInt();
			System.out.println("�ұ� ������ �� :");
			int s = scanner.nextInt();
			int maxs = s;
//			�迭�� ũ�⿡ �´� 2���� �迭 ���� �� �ʱ�ȭ
			int[][] N = new int[n][n];
//			System.out.println(N[4][4]);
//			�����¿� �̵��� ���� �迭 
			int[][] d = {{-1,0},{1,0},{0,-1},{0,1}};
//			�ұ������� ���� �°� �ݺ��� ����
			for(int j=0; j < maxs ;j++) {
				System.out.println("x ��ǥ:");
				int x = scanner.nextInt();
				System.out.println("y ��ǥ:");
				int y = scanner.nextInt();
				int[] start = {x,y};
				System.out.println("������ �Է� �ϼ���:");
				int w = scanner.nextInt();
				boolean loop = true;
				switch(w) {
				case 1: //��
					int[] ux = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[0] +=(ux[0]*k);
//						������ ����ų� �ٸ� �ұ����̰� �ӹ��� ������ �״´�
						if(start[0]<0 || start[0]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}
//					�����ϰ� ���� �� ��� ��ǥ�� 1�߰�
					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 2: // ��
					int[] dx = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[0] +=(dx[0]*k);
//						������ ����ų� �ٸ� �ұ����̰� �ӹ��� ������ �״´�
						if(start[0]<0 || start[0]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}
//					�����ϰ� ���� �� ��� ��ǥ�� 1�߰�
					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 3: // ��
					int[] ly = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[1] +=(ly[1]*k);
//						������ ����ų� �ٸ� �ұ����̰� �ӹ��� ������ �״´�
						if(start[1]<0 || start[1]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}
//					�����ϰ� ���� �� ��� ��ǥ�� 1�߰�
					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 4:// ��
					int[] ry = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[1] +=(ry[1]*k);
//						������ ����ų� �ٸ� �ұ����̰� �ӹ��� ������ �״´�
						if(start[1]<0 || start[1]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}
//					�����ϰ� ���� �� ��� ��ǥ�� 1�߰�
					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				}
			}//inner
			System.out.println("#"+i+" "+s);
		}//outer
		
	}
}
