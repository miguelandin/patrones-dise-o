package decorator.pattern;

public class SurName2 extends NameDecorator {
	public SurName2(Name name) {
		super(name);
	}
	
	@Override
	public String printName() {
		return super.printName() + " Abichuela";
	}
}
