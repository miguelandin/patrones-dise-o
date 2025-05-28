package abstrac.factory;

public class PatoA implements Pato {

	@Override
	public void descripcion() {
		System.out.println("Pato de invierno");

	}

	@Override
	public void vuela() {
		System.out.println("Vuela silencioso como un búho");

	}

}
