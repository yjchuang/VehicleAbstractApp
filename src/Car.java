
public class Car extends Vehicle 
{
	private String passager;

	public String getPassager() {
		return passager;
	}

	public void setPassager(String passager) {
		this.passager = passager;
	}
	
	@Override
	public String getDisplayText()
	{
		return super.toString() 
				+ "\n\tCar is a vehicle that is mainly for transporting passengers";
	}
}
