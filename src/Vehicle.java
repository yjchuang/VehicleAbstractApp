
public abstract class Vehicle {
private String run;
private String stop;
private String accelerate;


public String getRun() {
	return run;
}
public void setRun(String run) {
	this.run = run;
}
public String getStop() {
	return stop;
}
public void setStop(String stop) {
	this.stop = stop;
}
public String getAccelerate() {
	return accelerate;
}
public void setAccelerate(String accelerate) {
	this.accelerate = accelerate;
}

public Vehicle(String run, String stop, String accelerate) {
	this.run = run;
	this.stop = stop;
	this.accelerate = accelerate;
}
public Vehicle()
{
	
}

@Override
public String toString()
{
	return "Vehicle can run, stop and accelerate. ";
}

abstract String getDisplayText();

}
