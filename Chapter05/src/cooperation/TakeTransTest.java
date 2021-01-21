package cooperation;

public class TakeTransTest {
	public static void main(String[] args) {
		Student stuJ = new Student("James", 5000);
		Student stuT = new Student("Tomas", 5000);

		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(100);

		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);

		stuJ.takeBus(bus100);
		stuT.takeSubway(subwayGreen);

		stuJ.showInfo();
		stuT.showInfo();

		bus100.ShowInfo();
		bus500.ShowInfo();

		subwayGreen.ShowInfo();
	}
}
