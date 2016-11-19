import java.util.*;
class HelloWorldApp {
	static int[] a = {1,2,3,4,5};
	static int[] b = {3,2,9,3,7};
	//static ArrayList solution = new ArrayList();
	public static void hi(int n){
		if(n <= 0){
			System.out.println("By Leggy Blond");
			return;
		}
		System.out.println("Hi");
		hi(n-1);
	}
	public static int factorial(int n){
		//base case
		if(n == 1){
			return 1;
		}
		return n * factorial(n-1);
	}
	public static int sum(int n){
		if(n == 0){
			return 0;
		}
		return n + sum(n-1);
	}
    public static void main(String[] args) {
		System.out.println(sum(15));
    }
}