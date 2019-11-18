package ejercicios;

public class Ejercicio17ArraysClase {

	public static void main(String[] args) {
		/* String [] dias = {"lunes","martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		
		int diaSemana = 7;
		
		System.out.println("hoy es : " + dias[diaSemana-1]);
		// le resto 1 porque el 0 no existe ***recordar que se cuenta n-1
		
		for (String dia: dias)
		//hacemos un for optimizado. donde pongo dias puede ir dia o un array que contenga una expresi�n de este tipo		
			System.out.println("hoy es d�a : " + dia.toUpperCase());
		//Aqu� podemos hacer toUppercase porque tenemos la certeza de que el array viene completo. Si viniera incompleto no podr�amos utilizar toUppercase
		 en las posiciones que vinieran en blanco aparecer�a un error del tipo nullpointerexception - porque no sabe con qu� String trabajar 
		
		
		for (int i=0; i<5; i++)
			System.out.println("hoy es d�a V2: " + dias[i].toUpperCase());
		 */
				
		String [] dias = {"lunes","martes", "miercoles", "jueves", "viernes", null, null};
		
		int ind = 0;
			
		//int diaSemana = 1;
		
		//CASO 1: el m�s normal. El array est� completo (es decir, todas las variables vienen con contenido)
		//System.out.println("hoy es : " + dias[diaSemana-1]);
		
		System.out.println("\n\nCASO 1");
		for (String dia: dias) {
			if (dia != null)
					System.out.println("d�a CASO 1: " + dia.toUpperCase());
			//este primer for lo podemos hacer al tener la certeza de que viene lleno (aunque alg�n valor de los elementos venga con valor null
		}
		System.out.println("\n\nCASO 2 huecos al final con for");
		//CASO 2: Incompleto sin huecos, pero S� el tope de elementos que vienen (es decir, s� c�antos tienen contenidos) El array est� completo (es decir, todas las variables vienen con contenido)
		for (int i=0; i<5; i++)
			System.out.println("d�a CASO 2: " + dias[i].toUpperCase());
			//sabemos que todas las variables vienen todos seguidos (s� el n�mero de elementos que vienen, pero puede que alguno venga vac�o
		
		System.out.println("\n\nCASO 3 hueco al final con while sin tope");
		//CASO 3: Incompleto sin huecos, pero NO S� el tope. NO puedo hacer for, tengo que hacer un while
		while (ind < dias.length && dias[ind] != null) {
			System.out.println(dias[ind]);
			ind++;
		}
		
		System.out.println("\n\nCASO 4 hueco sin saber de donde");
		//CASO 4: Array con huecos
		for (String dia: dias) {
			if (dia != null)
				System.out.println("d�a CASO 4: " + dia.toUpperCase());
		}
	}
	

}

