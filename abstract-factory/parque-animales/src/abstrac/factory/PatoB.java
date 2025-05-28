package abstrac.factory;

public class PatoB implements Pato {

	@Override
	public void descripcion() {
		System.out.println("Pato de verano, parece una gaviota");
	}

	@Override
	public void vuela() {
		System.out.println("Vuela aleteando sus alas ruidosamente");
	}

}
