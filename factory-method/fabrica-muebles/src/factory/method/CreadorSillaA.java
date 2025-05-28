package factory.method;

public class CreadorSillaA extends CreadorMuebles {

	@Override
	public Mueble construirMueble() {
		return new SillaA();
	}

}
