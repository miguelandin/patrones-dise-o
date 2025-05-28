package abstrac.factory;

public class GatoA implements Gato {

	@Override
	public void descripcion() {
		System.out.println("Gato de invierno");
	}

	@Override
	public void corre() {
		System.out.println("El gato de nieve corre");

	}

}
