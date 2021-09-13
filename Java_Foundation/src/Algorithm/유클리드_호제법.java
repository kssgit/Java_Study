package Algorithm;

public class 유클리드_호제법 { // 최대 공약수
	public static void main(String[] args) {
		int a = 192;
		int b = 162;
		System.out.println(gcd(a,b));
	}
	public static int gcd(int a,int b) {
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
	}
}
