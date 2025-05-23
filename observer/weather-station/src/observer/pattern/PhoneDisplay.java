package observer.pattern;

public class PhoneDisplay implements Observer {
	WeatherStation station; // estancia del observable concreto
	
	public PhoneDisplay(WeatherStation station) {
		this.station = station;
		station.add(this);  // se auto-añade a la lista del observable
	}
	
	@Override
	public void update() {
		System.out.println("Phone\n Temperature: " + station.getTemp());
	}

}
