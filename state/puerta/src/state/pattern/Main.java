package state.pattern;

public class Main {
	public static void main(String args[]) {
		Gate gate = new Gate();
		
		// cerrada
		gate.pay();
		
		// procesando
		gate.pay();
		gate.payFailed();
		
		// cerrada
		gate.pay();
		
		//procesando
		gate.payOk();
		
		// abierta
		gate.pay();
		gate.enter();
		
		//cerrada
		gate.payFailed();
		gate.enter();
	}
}
