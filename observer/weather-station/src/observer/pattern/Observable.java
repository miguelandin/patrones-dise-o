package observer.pattern;

public interface Observable {
	public void add(Observer obs);
	public void remove(Observer obs);
	public void notifi();
}