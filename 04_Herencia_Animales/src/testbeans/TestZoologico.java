package testbeans;

import beans.Animal;
import beans.Gato;

public class TestZoologico {

	public static void main(String[] args) {
		Animal a1 = new Animal("camaleon - verde");
		Animal a2 = new Animal("hipopotamo - marron");
		
		Gato gato1 = new Gato("gato siames", 7);
		Gato gato2 = new Gato("callejero", 5);
		
		a1.sonido();
		gato1.sonido();
		
		Animal[] zoo = {a1,a2,gato1,gato2};
		//en el array me deja meter cualquier referencia a cualquier objeto de el padre y de lo que hereda
		
		for (Animal ele: zoo) {
			ele.sonido();
			if (ele instanceof Gato)
				((Gato) ele).mostrarDatos();
				}
		}
}
		
