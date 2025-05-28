package abstrac.factory;

public class GatoB implements Gato {

	@Override
	public void descripcion() {
		System.out.println("Gato de verano");
	}

	@Override
	public void corre() {
		System.out.println("El gato de playa no corre mucho");

	}

}
