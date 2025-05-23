package observer.pattern;
import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements Observable {
	double temperature = 0;
	Set<Observer> observerSet = new HashSet<>(); // tabla hash que contien objetos Observer
	
	@Override
	public void add(Observer obs) {
		observerSet.add(obs); // añade un nuevo observer a la tabla hash del observable

	}

	@Override
	public void remove(Observer obs) {
		observerSet.remove(obs); // quita cierto observer de la tabla hash del observable

	}

	@Override
	public void notifi() {
		for(Observer observer: observerSet) // recorre todo los observer de la tabla
			observer.update(); // llama a su función de actualizar

	}
	
	public double getTemp() { // devuelve la temperatura
		return this.temperature;
	}
	
	public void changeTemp(double newTemp) { // cambia la temperatura
		this.temperature = newTemp;
	}
}
