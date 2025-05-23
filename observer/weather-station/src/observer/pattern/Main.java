package observer.pattern;

public class Main {
	public static void main(String args[]) {
		WeatherStation station = new WeatherStation();
		PhoneDisplay phone1 = new PhoneDisplay(station);
		PhoneDisplay phone2 = new PhoneDisplay(station);
		WindowDisplay window1 = new WindowDisplay(station);
		
		station.changeTemp(35.6);
		station.notifi();
		
		station.changeTemp(-2.1);
		station.notifi();
	}
}
