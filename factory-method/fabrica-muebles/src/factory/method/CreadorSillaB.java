package factory.method;

public class CreadorSillaB extends CreadorMuebles {

	@Override
	public Mueble construirMueble() {
		return new SillaB();
	}

}
