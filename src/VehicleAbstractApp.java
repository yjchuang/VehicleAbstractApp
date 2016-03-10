
public class VehicleAbstractApp {

	public static void main(String[] args) 
	{
	
		Plane _plane = new Plane();
		//_plane.getDisplayText();
		System.out.println(_plane.getDisplayText());
		
		Car _car = new Car();
		_car.getDisplayText();
		System.out.println(_car.getDisplayText());
		
		Boat _boat = new Boat();
		_boat.getDisplayText();
		System.out.println(_boat.getDisplayText());
		
	}

}
