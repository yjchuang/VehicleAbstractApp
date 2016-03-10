
public class Plane extends Vehicle 
{
	private String fly;

	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}
	
	@Override
	public String getDisplayText()
	{
		return super.toString() + "\n\tPlane is a vehicle that can fly too";
	}
}
