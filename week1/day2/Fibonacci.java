package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 0,n2 = 1,sum,count = 8;
			System.out.println(n1);
			for(int i =1;i<=count;i++) {
			sum=n1 + n2;
			System.out.println(sum);
			n1 =n2;
			n2 =sum;
			}
	}

}
