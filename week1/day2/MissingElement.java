package week1.day2;

public class MissingElement {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,7,6,8};
			for(int i=1;i<num.length;i++) {
				if(num[i-1]!=1) {
					System.out.println(i);
					break;
				}
			}
		
	}

}
