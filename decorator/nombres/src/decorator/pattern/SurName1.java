package decorator.pattern;

public class SurName1 extends NameDecorator {
	public SurName1(Name name) {
		super(name);
	}
	
	@Override
	public String printName() {
		return super.printName() + " Limón";
	}
}