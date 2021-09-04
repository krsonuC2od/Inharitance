package sonu.com.Inheritance;

public class Bicycle {
	protected int gear;
	protected int speed;
	public Bicycle(int StartSpeed,int StartGear) {
		gear=StartGear;
		speed=StartSpeed;
		
	}
public void SetGear(int newValue) {
	gear=newValue;
}
public void StGear(int newValue) {
	gear=newValue;
}
public void applyBreake(int decrement) {
	speed -= decrement;
}
public void speedUp(int Increment) {
	speed += Increment;
}
}
