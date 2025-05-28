package abstrac.factory;

public class CreadorAnimalesA implements CreadorAnimales {

	@Override
	public Gato crearGato() {
		return new GatoA();
	}

	@Override
	public Pato crearPato() {
		return new PatoA();
	}

}
