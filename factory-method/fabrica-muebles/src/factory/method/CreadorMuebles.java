package factory.method;

public abstract class CreadorMuebles {
	public abstract Mueble construirMueble();
	
	public void descipcion() {
		Mueble silla = construirMueble();
		silla.descripcion();
	}
}
