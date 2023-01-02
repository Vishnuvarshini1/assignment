package week1.day1;

public class Calculator {
	public void sub() {
		int a = 5;
		int b = 3;
		System.out.println(a-b);
	}
	public int multiply(int a,int b) {
		return a*b;		
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sub();
		int result = c.multiply(20,5);
		System.out.println(result);
	}

}
