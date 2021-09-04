package sonu.com.Inheritance;

public class InheritanceDemo {
	public static void main(String [] args) {
		MountainBike mountainBike = new MountainBike(20,110,110);
		System.out.println("Gear is :" +mountainBike.gear);
		System.out.println("Seat heihght is :" +mountainBike.seatHeight);

		System.out.println("Speed is  :" +mountainBike.speed);
		
		mountainBike.applyBreake(110);
		System.out.println("BikeSpeed after appling break is "+mountainBike.speed);
	}

}
