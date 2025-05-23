package strategy.pattern;

public class NormalFlyBehaviour implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Flap! Flap! Flap!");
	}
}
