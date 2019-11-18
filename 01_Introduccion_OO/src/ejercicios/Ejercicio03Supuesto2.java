package ejercicios;

public class Ejercicio03Supuesto2 {

	public static void main(String[] args) {
	// 1. Declarar variables
	int lado1 = 0, lado2 = 0;
	int perimetro = 0;
	int area = 0;
	double hipotenusa = 0;
		
	// 2. obtener los datos de entrada
	lado1 = 7; lado2 = 4;
		
	// 3. Procesar los datos de entrada genarando salida parcial (si hace falta/total)
	perimetro = (lado1 + lado2) * 2;
	System.out.println("Resultado esperado perimetro 22 " + perimetro);
	area = lado1 * lado2;
	System.out.println("Resultado area 28 " +area);		
	hipotenusa = Math.sqrt (lado1 * lado1 + lado2 * lado2);
	// System.out.println("Resultado hipo 65 antes de incluir el Math " +hipotenusa);
	System.out.println("Resultado hipo 8.algo " +hipotenusa);
	
	String prueba = String.valueOf(false);
	System.out.println(prueba);
	
	// 4. Escribir estadísticas
		
	
	}

}
