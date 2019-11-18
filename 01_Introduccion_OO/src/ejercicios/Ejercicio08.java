package ejercicios;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int num1 = 0; int num2 = 0;
		//String palabra = null;
		
		System.out.println("Ingresar el primer valor");
		num1 = leer.nextInt();
		System.out.println("Ingresar el segundo valor");
		num2 = leer.nextInt();
		System.out.println("Ingresar el tipo de operación");
		String palabra1 = leer.next();
		
	switch (palabra1) {
	
		case "sumar":
			System.out.println("la suma es " + (num1 + num2));
			break;
		
		case "restar":
			System.out.println("la resta es " + (num1 - num2));
			break;
		
		case "multiplicar":
			System.out.println("el producto es " + (num1 * num2));
			break;
		
		case "dividir":
			System.out.println("la división es " + (num1 / num2));
			break;
		
		case "resto":
			System.out.println("el resto es " + (num1 % num2));
			break;
		
		default:
			System.out.println("Opción errónea");
		
	leer.close();
		
					}
										}
	}

