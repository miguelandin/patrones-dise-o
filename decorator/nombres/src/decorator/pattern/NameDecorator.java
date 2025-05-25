package decorator.pattern;

public abstract class NameDecorator implements Name {
	protected Name name;
	
	public NameDecorator(Name name) {
		this.name = name;
	}
	
	@Override
	public String printName() {
		return name.printName();

	}

}
