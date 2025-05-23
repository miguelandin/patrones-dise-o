package strategy.pattern;

public class StrangeQuackBehaviour implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Miau...");
	}
}
