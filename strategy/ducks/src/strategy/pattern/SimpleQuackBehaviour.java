package strategy.pattern;

public class SimpleQuackBehaviour implements QuackBehaviour {

	@Override
	public void quack(){
		System.out.println("Quack!");
	}

}
