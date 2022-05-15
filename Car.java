package week1.day1;

public class Car {

	public void applyBreak()
	{
		System.out.println("Applying the break ...");
	}
	public void applyGear()
	{
		System.out.println("Applying the gear ...");
	}
	public void switchonAc()
	{
		System.out.println("Switching on the AC ...");
	}
	public void applyAcclerate()
	{
		System.out.println("Applying the accelerator ...");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("This is Car");
		car.applyBreak();
		car.applyGear();
		car.switchonAc();
		car.applyAcclerate();

	}
}
