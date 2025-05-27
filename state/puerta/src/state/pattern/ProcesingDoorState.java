package state.pattern;

public class ProcesingDoorState implements GateState {
	private Gate gate; // para poder comunicarse con la puerta
	
	public ProcesingDoorState(Gate gate) {
		this.gate = gate;
	}
	
	@Override
	public void enter() {
		System.out.println("Se esta procesando el pago, espera!");

	}

	@Override
	public void pay() {
		System.out.println("Ya has pagado, esperate a que lo procese...");

	}

	@Override
	public void payOk() {
		System.out.println("Pago aceptado, pase!");
		gate.changeState(new OpenDoorState(gate));
	}

	@Override
	public void payFailed() {
		System.out.println("Pago no aceptado, broke mf alert!!");
		gate.changeState(new ClosedDoorState(gate));
	}

}
