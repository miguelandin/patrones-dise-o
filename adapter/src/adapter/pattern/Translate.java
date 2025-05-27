package adapter.pattern;

public class Translate implements Translator { // adapter
	private English english = new  English();
	
	@Override
	public void translate() {
		english.printHello();
	}

}
