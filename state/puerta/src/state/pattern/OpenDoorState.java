package state.pattern;

public class OpenDoorState implements GateState {
	private Gate gate; // hay que saber a quien le estamos cambiando el estado, la puerta original
	
	OpenDoorState(Gate gate) {
		this.gate = gate;
	}
	
	@Override
	public void enter() {
		System.out.println("Entrando...");
		gate.changeState(new ClosedDoorState(gate)); // cambia de estado la puerta ha cerrado
	}

	@Override
	public void pay() {
		System.out.println("El pago ya ha sido realizado correctamente, pasa de una vez");

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
