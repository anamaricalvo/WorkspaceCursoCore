package ejercicios;

public class Ejercicio15Repetitiva4 {

	public static void main(String[] args) {
		
		int numeroAzar = 0, pares = 0, impares = 0, suma = 0;
		double media = 0;
		
		for (int i=1; i<=10; i++) {
			numeroAzar = (int)(Math.random()*50+1);
			System.out.println(numeroAzar);
			suma += numeroAzar;
			
			if (numeroAzar%2 == 0)
				pares++;
			else
				impares++;
		}
		System.out.println("pares : " + pares);
		System.out.println("impares : " + impares);
		System.out.println("suma : " + suma);
		media = (double)suma/10;
		System.out.println("media : " + media);
	}

}
