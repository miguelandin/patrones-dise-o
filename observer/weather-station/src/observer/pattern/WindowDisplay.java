package observer.pattern;

public class WindowDisplay implements Observer {
	WeatherStation station;
	
	public WindowDisplay(WeatherStation station) {
		this.station = station;
		station.add(this); // se auto-añade a la lista del observable
	}
	
	@Override
	public void update() {
		System.out.println("Window\n Temperature: " + station.getTemp());
	}

}
