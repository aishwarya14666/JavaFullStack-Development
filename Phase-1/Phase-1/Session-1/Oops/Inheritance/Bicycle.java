package Inheritance;

public class Bicycle {
	private int gear;
	private int speed;
	
	public Bicycle(int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	public void speedUp(int increment) {
		speed=speed+increment;
	}
	public void applyBreak(int decrement) {
		speed=speed-decrement;
	}
	@Override
	public String toString() {
		return "Bicycle [no of gears=" + gear + ", speed of bicycle=" + speed + "]";
	}

}
