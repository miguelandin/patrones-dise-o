package strategy.pattern;

public class Duck {
	public FlyBehaviour Cfly;
	public QuackBehaviour Cquack;
	
	public Duck(FlyBehaviour concreteFly, QuackBehaviour concreteQuack) {
		this.Cfly = concreteFly;
		this.Cquack = concreteQuack;
	}
	
	public void display() {
		System.out.print("---DUCK STATS--- \nQuack: ");
		Cquack.quack();
		System.out.print("Fly: ");
		Cfly.fly();
	}
	
	public void fly() {
		this.Cfly.fly();
	}
	
	public void quack() {
		this.Cquack.quack();
	}
}
