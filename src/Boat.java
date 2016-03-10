
public class Boat extends Vehicle {
	private String drift;

	public String getDrift() {
		return drift;
	}

	public void setDrift(String drift) {
		this.drift = drift;
	}
	
	@Override
	public String getDisplayText()
	{
		return super.toString() + "\n\tBoat is a vehicle that can float too";
	}
	
}
