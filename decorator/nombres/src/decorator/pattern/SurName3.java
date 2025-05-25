package decorator.pattern;

public class SurName3 extends NameDecorator{
	public SurName3(Name name) {
		super(name);
	}
	
	@Override
	public String printName() {
		return super.printName() + " Tercero";
	
	}
}