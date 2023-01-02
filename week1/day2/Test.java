package week1.day2;

public class Test {
		public void convert() {
			int num = -35;
				if(num<0) {
					System.out.println(num + "number is negative");
					num = num * (-1);
					System.out.println(num + "number is positive");
				}
		}
	public static void main(String[] args) {
		 Test t = new Test();
		 t.convert();

	}

}
