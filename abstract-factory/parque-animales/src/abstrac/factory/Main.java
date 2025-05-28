package abstrac.factory;

public class Main {
	public static void main(String args[]) {
		CreadorAnimales creadorAnimales = new CreadorAnimalesA(); // crea animales de invierno
		Gato gato = creadorAnimales.crearGato();
		Pato pato = creadorAnimales.crearPato();
		
		gato.descripcion();
		gato.corre();
		
		pato.descripcion();
		pato.vuela();
		
		creadorAnimales = new CreadorAnimalesB(); // crea animales de verano
		
		gato = creadorAnimales.crearGato();
		pato = creadorAnimales.crearPato();
		
		gato.descripcion();
		gato.corre();
		
		pato.descripcion();
		pato.vuela();
	}
}
