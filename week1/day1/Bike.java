package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Applied break for bike");
	}
	public void soundHorn() {
		System.out.println("sound horn is there for bike");
	}
	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		c.applyBreak();
		c.soundHorn();
		b.applyBreak();
		b.soundHorn();
	}

}
