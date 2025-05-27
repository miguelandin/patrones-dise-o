package state.pattern;

public class ClosedDoorState implements GateState {
	private Gate gate;
	
	ClosedDoorState(Gate gate) {
		this.gate = gate;
	}
	
	@Override
	public void enter() {
		System.out.println("*Se golpea contra la puerta*");

	}

	@Override
	public void pay() {
		System.out.println("Realizando pago");
		gate.changeState(new ProcesingDoorState(gate));
	}

	@Override
	public void payOk() {
		return;
	}

	@Override
	public void payFailed() {
		return;
	}

}
