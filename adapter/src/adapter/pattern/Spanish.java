package adapter.pattern;

public class Spanish { // client
	public static void main(String args[]) {
		Translator translator = new Translate();
		translator.translate();
	}
}