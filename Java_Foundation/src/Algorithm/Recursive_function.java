package Algorithm;

public class Recursive_function {
	public static void main(String[] args) {
		HelloWorld(5);
	}

	public static void HelloWorld(int n) {
		if(n==0) {
			return;
		}
		System.out.println("HelloWorld "+n);
		HelloWorld(n-1);
	}
}
