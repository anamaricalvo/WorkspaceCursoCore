package ejercicios;

public class Ejercicio05Ifs {
	public static void main(String[] args) {
		
		int mes = 8;
		
		switch(mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case  12:
			System.out.println("el mes : " + mes + " es de 31");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println("el mes : " + mes + " es de 30");
			break;
			
		case 2:
			System.out.println("el mes : " + mes + " es de 28/29");
			break;
			
		default:
			System.out.println("el mes no es válido");
		}}}
	
		/* int num = 4;
		if (num == 4)
			System.out.println("es 4");
		else
		System.out.println("no es cuatro");
		
		System.out.println("esto es todo amigoooooo");
		
	}*/	
		
