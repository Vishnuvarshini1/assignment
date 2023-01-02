package week1.day2;

public class Operator {
			
			public void number() {
					int num = -50;
				if(num>0) {
					System.out.println(num + "The number is postive");
				}
				else if(num<0) {
					System.out.println(num + "The number is negative");
				}
				else
				{
			System.out.println( num + "The number is neither postive nor negative");
				}
			}
				
			
	public static void main(String[] args) {
		Operator o = new Operator();
		o.number();

	}

}
