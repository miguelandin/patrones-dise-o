package factory.method;

public class Main {
	public static void main(String args[]) {
		// selecciona la factoría de sillas de metal
		CreadorMuebles factoria = new CreadorSillaA();
		factoria.descipcion(); // ve la descricpión
		
		// selecciona la factoria de sillas de madera
		factoria = new CreadorSillaB();
		factoria.descipcion();
		
	}
}
