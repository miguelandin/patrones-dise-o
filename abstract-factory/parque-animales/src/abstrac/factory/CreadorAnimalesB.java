package abstrac.factory;

public class CreadorAnimalesB implements CreadorAnimales {

	@Override
	public Gato crearGato() {
		return new GatoB();
	}

	@Override
	public Pato crearPato() {
		return new PatoB();
	}

}
