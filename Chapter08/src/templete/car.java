package templete;

public abstract  class car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("Turn On the car");
	}
	public void turnOff() {
		System.out.println("Turn off the car");
	}
		
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
