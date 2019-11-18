package ejercicios;
import java.util.Scanner;

public class Ejercicio12Repetitiva1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int numero = 0, contador = 0, acumulador = 0;
		numero = sc.nextInt();
	
	// System.out.println("Introduzca otro número");
				
	while (numero != 0) { 
		contador++;
		acumulador += numero;
		// OJO Vuelvo a leer que se me buclae si no
		numero = sc.nextInt();
	}
	
	System.out.println("numeros leídos : " + contador);
	System.out.println("suman todos : " + acumulador);
	
	sc.close();
	}}
	