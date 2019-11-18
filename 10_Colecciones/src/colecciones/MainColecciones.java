package colecciones;

import java.util.ArrayList;

public class MainColecciones {

	public static void main(String[] args) {
		ArrayList<String>listaNombres = new ArrayList<String>();
		listaNombres.add("Mortadelo");
		listaNombres.add("Filemon");
		listaNombres.add("Dr.Bacterio");
		listaNombres.add("Ofelia");
		listaNombres.add("Super Intendente Vicente");
		
		System.out.println(listaNombres.get(0));//Imprime Mortadelo
		System.out.println(listaNombres.get(3));//Imprime Ofelia
		//Para saber el tama�o del array ejecutar lo siguiente
		System.out.println(listaNombres.size());//Imprime 5
		
		//Lo siguiente muestra todo el array//MANERA MALA o poco usada de recorrer listas
		for(int i = 0; i < listaNombres.size();i++) {
			System.out.println(listaNombres.get(i));
		}
		
		System.out.println("*********"); 
		
		//MANERA BUENA de recorrer listas. Es la usada normalmente. Se llama for each	
		//la primera parte hay que declarar una varible dentro del for del mismo tipo que la lista que queremos recorrer (en el ejemplo: String valor)
		//la segunda parte es la lista que queremos recorrer (en el ejemplo: listaNombres)
		for (String valor : listaNombres) {
			System.out.println(valor);
		}
		
		System.out.println("****** array enteros **********");
		//si us�ramos lo de arriba dar�a error porque la lista de colecciones no sirve para primitivos. si queremos crear un array de enteros debemos de usar su correrspondiente tipo wrapper (envoltorio)
		//Todos los primitivos tienen su correspondiente tipo wrapper. Integer es el wrapper de int. Double es el wrapper de double
		int i = 5;
		Integer entero = new Integer(4);
		Integer entero2 = 5;//esto se llama autoboxing (convierte el primitivo en objeto. Es decir, la l�nea 38 hace lo mismo que la 37, pero m�s "corto"
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		double primitivoDouble = 6.9;
		Double objetoDouble = 6.9;
		//ArrayList<Double> listaEnteros = new ArrayList<>();
		
		listaEnteros.add(1);
		listaEnteros.add(45);
		listaEnteros.add(new Integer(89));
		
		//Para recorrer este array de enteros
		for (Integer v : listaEnteros) {
			System.out.println(v);
		}
	}
}