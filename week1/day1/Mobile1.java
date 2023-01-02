package week1.day1;

public class Mobile1 {
	public void makeCall() {
        String mobileModel =	"realme";	
		float mobileWeight = 10.02f;
		System.out.println("Mobile Model"+" "+mobileModel);
		System.out.println("Mobile Weight"+" " +mobileWeight);

	}
	public void sendMsg() {
		boolean isFullChargered = true;
		int mobileCost = 10000;
		System.out.println("Mobile is fully Chargered"+ " "+isFullChargered);
		System.out.println("Mobile Cost"+ " "+mobileCost);
	}
	public static void main(String[] args) {
		System.out.println(" This is my Mobile");
		Mobile1 mob = new Mobile1();
		mob.makeCall();
		mob.sendMsg();
	}

}
