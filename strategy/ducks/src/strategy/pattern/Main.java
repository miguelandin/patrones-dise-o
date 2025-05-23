package strategy.pattern;

public class Main {
	public static void main(String args[]) {
		QuackBehaviour Cquack = new SimpleQuackBehaviour();
		FlyBehaviour Cfly = new NormalFlyBehaviour();
		
		Duck pato = new Duck(Cfly, Cquack);
		
		pato.display();
		
		Cquack = new StrangeQuackBehaviour();
		
		pato = new Duck(Cfly, Cquack);
		
		pato.display();
		
		Cfly = new FatFlyBehaviour();
		
		pato = new Duck(Cfly, Cquack);
		pato.display();
	}

}
