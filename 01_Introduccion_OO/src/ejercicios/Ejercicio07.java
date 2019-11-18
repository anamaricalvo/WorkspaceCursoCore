package ejercicios;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int num1 = 0;
			
		num1=leer.nextInt();
		switch(num1) {
		case 1:
			System.out.println("Escribimos Uno");
			break;
			
		case 2:
			System.out.println("Escribimos Dos");
			break;
			
		case 3:
			System.out.println("Escribimos Tres");
			break;
			
		default:
			System.out.println("Otro número");
		}
	}

}