package state.pattern;

public class Gate {
	private GateState gateState; // variable de los estados diferentes que hay
	
	Gate() { //se inicializa la puerta en cerrada.
		this.gateState = new ClosedDoorState(this); 
	}
	
	public void enter() {
		gateState.enter();
	}
	
	public void pay() {
		gateState.pay();
	}
	
	public void payOk() {
		gateState.payOk();
	}
	
	public void payFailed() {
		gateState.payFailed();
	}
	
	public void changeState(GateState newState) { // función para cambiar la clase de gateState
		gateState = newState;
	}
}
