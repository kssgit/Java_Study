package Recursive_Function;

public class Recursive_function {
	public static void main(String[] args) {
		HelloWorld(5);
	}
	//Àç±Í ÇÔ¼ö
	public static void HelloWorld(int n) {
		if(n==0) {
			return;
		}
		System.out.println("HelloWorld "+n);
		HelloWorld(n-1);
	}
}
