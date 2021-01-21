package Chapter08_Templete;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void washCar() {
		System.out.println("세차 합니다.");
	}
	final public void Run() {
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
	
}
