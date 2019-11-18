package ejercicios;

public class Ejercicio16ExplicaacionArrays {

	public static void main(String[] args) {

		String cadena = "tomas;andres;ana;esteban;sara;ignacio;mariel";
		
		int [] pares = {2,6,8,10,34,68};
		String [] nombres = {"andres", "esteban", "zacarias", "eva", "ana"};
		
	//	System.out.println(pares.length);
		// Con esto me saca el número de elementos del array
	//	System.out.println(nombres.length);
		pares [1] = 66;
		/* esto se hace para cambiar el valor (contenido) en una posición. En esta estoy cambiando el valor que tenía antes (2) por  66. Entre corchetes, pones la 
		posicion que quieres cambiar. En este caso es la segunda. Se dice "pares afectado de 1" (al ser las variables del mismo tipo, se distinguen por la posicón que ocupan.
		Se pone 1, porque hay que recordar que se lee n-1
		*/
		
	/*	for (int i=0; i < pares.length; i++)
			System.out.println("en la posicion " + i + " hay " + pares [i] );
		
		for (String ele: nombres) {
			System.out.println("me llamo " + ele );
			}
		
		System.out.println("\n\n\n");
		
		String [] nombre2 = cadena.split(";");
		// si lo hace alguien que sabe de JAVA no necesita la variable nombre2 para nada
		for (String ele: nombre2)
			System.out.println("nombre2 : " + ele);
		
		System.out.println("\n\n\n");
		
		for (String ele : cadena.split(";"))
			System.out.println("nombre2 : " + ele);	
		*/
		pruebaArrayVacio();
		}
	
	
	
	public static void pruebaArrayVacio() {
		
		String [] cadenas = new String [6];
		int [] numeros = new int [7];
		
		// carga del array con numeros aleatorios
		
		for (int i=0; i<numeros.length; i+=2)
			// en esta opción como estás haciendo i+2 estás dejando "huecos" y se rellenan de ceros
			numeros[i] = (int) (Math.random()*50+1);
		
		for (String ele: cadenas)
			System.out.println(ele);
			
		for (int ele: numeros)
			System.out.println(ele);
		
	}
	}
